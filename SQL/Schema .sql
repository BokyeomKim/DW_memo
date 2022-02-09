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
