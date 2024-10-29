create database bookkk;
create table if not exists member(
id varchar(20) not null primary key,
passwd varchar(20),
name varchar(30)
);
select * from member;