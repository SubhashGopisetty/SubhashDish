DROP TABLE IF EXISTS TBL_EMPLOYEES;

create table TBL_EMPLOYEES
(
    EMP_ID INT  PRIMARY KEY auto_increment,
    FIRST_NAME VARCHAR not null,
    LAST_NAME  VARCHAR not null,
    DOB        VARCHAR not null,
    AGE        INTEGER not null,
    SALARY     INTEGER NOT NULL ,
    PHNO       INTEGER not null
);
-- INSERT INTO  TBL_EMPLOYEES(FIRST_NAME,LAST_NAME,DOB,AGE,SALARY,PHNO) values
--                                                                   ('subbu','GA','1-09-1999',22,100,123456678),
--                                                                   ('ramnu','kolla','1-09-2001',20,120,996633211),
--                                                                   ('somu','RK','20-12-1999',22,222,898982113),
--                                                                   ('Rajesh','kr','21-09-1998',23,123,1234568910),
--                                                                   ('Rakesh','RK','12-09-1999',22,234,123456789);