# JSON을 사용하는 이유
---



JSON :
데이터를 전송할 때 많이 사용되는 경량(한번에 묶는다.)의
DATA 교환 형식

장점 : 1.문서화를 할 수 있다 2. json을 설계하면 재사용이 가능하다.

\*\* DATA 형식

1. 중괄호 {}
2. key(중복 불가) , value(중복 가능) 구성
3. value(문자형, 정수형, 논리형, 배열, json .........)

---

ex.
길어지는 코드...일일 이 보낼수 없으니 json 으로 묶어 보낸다.
프론트엔드 개발자와 백엔드개발자 간 소통을 json 으로 한다.

포맷 형식 .json (공통언어)

어느 한 분야에 국한 되는 것이 아닌, 소통을 하기 위한것.

---

emp:
{
empno : 7369,
ename : "SMITH"
}
---


## :을 기준을 왼쪽을 key, 오른쪽 을 value 라고 칭함,
ename : "SMITH"
ename : "BRYAN"
</br>
▲동일한 key 로 불가.
---
emp:
{
empno : 7369,
ename : "SMITH"
mgr : [7902,7390]
}
int empno = 7369

---

SMITH 사수의  직업과 급여를 알고싶다. JSON으로 표현해보자. 

emp:
{
empno : 7369,
ename : "SMITH"
mgr : [{empno :1, job, :"CLERK", sal : 3000 },{empno: 2, (...이하 생략...) }]
}
int empno = 7369

---

emp
SMITH 의 직업과 급여를 알고싶다.
SMITH 의 부서이름을 알고싶다.
SMITH 의 부서 인원수를 알고싶다.

emp:
{
job : CLERK,
dname : SALES,

<!-- 부서가 2개 일경우dept : [{dname : "SALES"},{dname : MANAGE}] -->

dnameCount:5,
sal : 1200
}

---

 SMITH 의 사원번호와 급여를 알고싶다.
SMITH 의 사수는 3명이고,
사수의 번호와 직업을 알고싶다.



emp:
{

 사원번호, 급여 생략 

mgr : [{사수번호 :1, 직업 : " 영업"}, {사수번호 :1, 직업 : " 영업"},{사수번호 :1, 직업 : " 영업"}]

##### count 사용 할것 없이 배열을 사용하면 , 받는 쪽에서 개수를 셀수 있다. 

}
