
클라이언트 간 --> 구간을 전송구역
(json 데이터 포맷 ,앞 약자 Js 는 자바스크립트, 자바스크립트만 사용 가능한것이 아니다.)
input 을 했을때 json 형식으로 보내주어야 한다.
***사용빈도율 매우높음***
-----------------------------
C,
Java,
Node JS,
Python,
Ruby, _
----------------> DB 구간을 서버라 칭함. 

//JSON  (Java Script Object Notation / Notation : 표기법 )
//Java 에서는 Json을 Map이라고 함.
//JSON : 데이터 형식(단순히 데이터를 표시하는 방법)


var information = {
    "name": "kim bo kyeom",
    "age": 30,
    "address": "대전 충정로 136",
    "isMarri": false
};
//<-----json : information 을 서버로 전송
// 왼쪽에 오는 name, age..... = key
// 오른쪽 valeue
//json 은 key 와 value 로 구성.
//주의점 !
// 1. key 는 중복 불가. value 는 중복 가능
// 2.value 에 정수형(int, duble), 문자형(string) , boolean형, 배열형  (=array), null
// 3.중괄호로 감싼다.


    // 변수이름 
    // 1. 명사 
    // 2.복합명사일 때(카멜 표기법 int userInformation) 
    // 3. 데이터 타입이 boolean 형일 때 변수이름 앞에 is + (명사)옴 
    // ex. isLogin(로그인 여부)true, false
    //  isMeal(식사여부)
    
    // .을 찍으면 데이터 타입도 알려준다.;
