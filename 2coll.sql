create database Users52;
use Users52;
create table if not exists Users (
user_id int auto_increment primary key, /*auto_increment -  автоматически увеличивает значение этого столбца при вставке новых записей*/
name varchar(100) not null,
mail varchar(100) unique not null, /*unique - это уникальность*/
phone varchar(10) unique not null,
registration_date timestamp not null default current_timestamp, /*timestamp - это тип данных который хранит в себе дату и время. DEFAULT CURRENT_TIMESTAMP: Это задаёт значение по умолчанию для этого столбца*/
check (mail <> '' and phone <> '') /*check - это ограничение, которое заставляет базу данных проверять некоторые условия при вставке или обновление записи, mail <> '' and phone <> '', проверяет на то, что бы они не были пустыми*/
);
insert into Users (name, mail, phone)
values
('Tayler', 'tayler52@example.com', '2345634526'),
('Rasskazchik', 'rasskazchik12@example.com', '1346354261'),
('Marla', 'marla1488@example.com', '5468723248');
create index idx_email on Users(mail);

create table if not exists Orders (
order_id int auto_increment primary key,
user_id int not null,
amount decimal(10, 2) not null check (amount >= 0), /*Означает, что значение может содержать до 10 цифр и две из них с плавающей точкой, то есть макс значение 99999999.99, используется для записи денег*/
order_date timestamp not null default current_timestamp,
status varchar(30) not null,
foreign key (user_id) references Users(user_id) on delete cascade /*foreign - это вненшний ключ для связи двух таблиц*/
);
insert into Orders (user_id, amount, order_date, status)
value
(1, 250, '2025-11-01', 'completed'),
(1, 150, '2025-11-05', 'in progress'),
(2, 100, '2025-10-10', 'canceled'),
(3, 500, '2025-11-12', 'completed'),
(3, 200, '2025-11-18', 'completed');
create index idx_order_date on Orders(order_date);

-- 1. Список всех пользователей и их заказов, отсортированных по дате заказа
select u.name, o.order_id, o.amount, o.order_date, o.status /*'u'.name, 'o'.order пишется для указания таблицы с которой будем работать и данные внутри, */
from Users u /*Указываем за основу User таблицу*/
left join Orders o on u.user_id = o.user_id /*left join нужын для объединение данных двух таблиц, так же 'on' который проверяет где строки user_id сопвпадает в User Orders*/
where o.order_id is not null /*Просиходи фильтрация, она выбирает только те строки где o.order_id null (заполнено)*/
order by o.order_date desc; /*Эта часть сортирует результаты по столбцу order_date в нисходящем порядке (DESC), то есть от самой недавней даты к самой ранней.*/

-- 2. Пользователи без заказов, отсортированные по дате регистрации
select * from Users where user_id not in (select distinct user_id from Orders) order by registration_date; /*select distinct - указывает, что запрос должен возвращать только уникальные строки. Дубликаты удаляет*/

-- 3. Общее количество заказов и сумма по всем заказам для каждого пользователя
select u.name, COUNT(o.order_id) as total_orders, SUM(o.amount) as total_amount
from Users u
join Orders o on u.user_id = o.user_id
group by u.name;

-- 4. Информация о пользователях и заказах с подробностями, отсортированная по статусу и дате
select u.name, o.order_id, o.amount, o.order_date, o.status
from Users u
join Orders o on u.user_id = o.user_id
order by o.status, o.order_date desc;

-- 5. Пользователи с общей суммой заказов > 1000
select u.user_id, u.name, SUM(o.amount) as total_amount
from Users u
join Orders o on u.user_id = o.user_id
group by u.user_id, u.name
having SUM(o.amount) > 1000;

-- 6. Пользователи с хотя бы одним заказом со статусом "отменен" или "доставлен"
select distinct u.name
from Users u
join Orders o on u.user_id = o.user_id
where o.status in ('отменен', 'доставлен');

-- 7. Пользователи с минимальной суммой заказа > 500
select u.name
from Users u
join Orders o on u.user_id = o.user_id
group by u.name
having MIN(o.amount) > 500;

-- 8. Пользователи, заказы которых были сделаны в первый месяц после регистрации
select u.name
from Users u
join Orders o on u.user_id = o.user_id
where o.order_date between u.registration_date and DATE_ADD(u.registration_date, interval 1 month);

-- 9. Пользователи, зарегистрированные более года назад, но без заказов за последние полгода
select u.name
from Users u
left join Orders o on u.user_id = o.user_id
where u.registration_date < DATE_SUB(CURDATE(), interval 1 year)
  and (o.order_id is null or o.order_date < DATE_SUB(CURDATE(), interval 6 month));

-- 10. Пользователи с заказами в текущем месяце
select distinct u.name
from Users u
join Orders o on u.user_id = o.user_id
where month(o.order_date) = month(CURDATE());

drop database Users52;