create database contact;
use contact;
create table people (
id integer primary key,
name varchar(30) not null,
surname varchar(30) not null,
mail varchar(30)
);
insert into people (id, name, surname, mail)
value
(1, 'Роман', 'Романович', 'roman@gmail.com'),
(2, 'Владимир', 'Владимирович', 'vladimir@gmail.com'),
(3, 'Сергей', 'Сергеевич', 'ser@gamil.com');
select *from people;
select name, surname from people;
update people set mail = 'romman@gmail.com' where id = 1;
delete from people where namee = 'Роман';
drop database contact;