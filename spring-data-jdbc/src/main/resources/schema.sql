create table article(
    id bigint auto_increment primary key,
    title varchar(255) not null,
    content varchar(255) not null
);

create table comment(
    id bigint auto_increment primary key,
    article bigint not null,
    content varchar(255) not null
);