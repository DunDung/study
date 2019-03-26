create user 'spring5'@'localhost' identified by 'spring5';

create database todo1 character set=utf8;

grant all privileges on spring5fs.* to 'spring5'@'localhost';

create table spring5fs.ITEM (
    ID int auto_increment primary key,
    CONTENTS varchar(100)
) engine=InnoDB character set = utf8;
