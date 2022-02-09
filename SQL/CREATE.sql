
**SQL~~
DDL (auto commit)
1.CREATE
=> 테이블 생성!
CREATE TABLE student(-- 뒤에는 만들고자 하는 테이블 이름이 온다--
    id int(11) NOT NULL,  -- 컬럼이름  정수형 데이터타입  조건: NOTNULL--
    name VARCHAR(20) NOT NULL,
    height int(5),
    age INT(5) DEFAULT 0, -- 나이를 insert 하게 되면 default 가 0이기 때문에 0이 된다.--
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP,
     constraint student_id_pk primary key(id)-- 어떤 변수인지에 따른 제약
);

----insert data ------- 
insert into student 
(id,name,height,age,create_at)  -- 전부 다 입력했기 때문에 이줄은 생략이 가능하다.--
values (1,'홍길동',190,30,now())


-- 테이블을 지우다
drop table student ;


id int(11) NOT null auto_increment, -- id int(11) NOT null auto_increment primary key, 도 가능 하나, 변수가 없어 나중에 작업하기 힘들수 있다.

2.DROP
3.ALTER

---------------스키마 코드-----------------------------------------------------------------------------------------------------------

CREATE TABLE student(
    id int(11) NOT null auto_increment, 
    name VARCHAR(20) NOT NULL,
    height int(5),
    age INT(5) DEFAULT 0, 
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP,
   constraint student_id_pk primary key(id)
);


insert into student
(name,height)
values ('홍길동',190)



------------------------------------------------------------------------------------------------------------------------------