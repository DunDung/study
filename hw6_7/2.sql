create table EMP(
ID int NOT NULL,
LAST_NAME varchar(25) NULL,
FIRST_NAME varchar(20) NULL,
SALARY number(38, 2) NULL,
DEPT_ID int NULL,
foreign key(DEPT_ID) references DEPT(ID)
);