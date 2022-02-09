*****SQL
DML
- insert : 데이터를 저장
작성 법1.
INSERT INTO emp(ename,sal,job)
VALUES('홍길동',3000,'manager')

주의 : 
1.테이블에 job 컬럼이 not null이면, 
insert 할때 무조건 데이터를 넣어야 함.

2. 테이블에 기본키 설정이 auto increment가 
아니라면 기본키 데이터를 넣어야 함.

3. commit; 해야 최종 insert 가 됨.
(디비버 같은 프로그램은 auto commit 으로 설정되어 있음.)
작성 법2.
해당 테이블에 데이터를 모두 넣으면, 테이블 뒤 괄호 생략
INSERT INTO emp
VALUES('홍길동',3000,'manager',.....)

ex.)
insert into dept(deptno,dname,loc)
values(50,'쏘리쏘리','대전')
commit;




-delete : 데이터 삭제
DELETE FROM dept 
WHERE deptno = 70

주의  : 
1.해당 컬럼이 ON DELETE CASCADE 로 설정되어 있으면,
연관된 컬럼 모두 삭제 됨. 
2. commit; 해야 최종 delete가 됨
실제로는 데이터 삭제 x 
삭제여부 컬럼을 만듦
ex.) 컬럼이름  : 회원탈퇴여부
      데이터 : 'y' or 'n'


