create database shop6;
use shop6;
create table groceries (
id integer primary key,
name varchar(30) not null,
count varchar(30) null,
availability varchar(30) not null);
insert into groceries (id, name, count, availability) value
(1, 'Apple', '39', 50),
(2, 'Avocado', '50', 25),
(3, 'Kiwi', '49', 50);
update groceries set availability = 60 where id = 1;
select * from groceries where count < '50';
drop database shop6;
