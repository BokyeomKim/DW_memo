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
    console.log(information),
    console.log(information.age);

var age = information.age;
if (age >= 30) {
    console.log('계란한판')
} else {
    console.log('20대')
}
// 상수
const PI = 3.14;
var array = [1, 3, 4, 5, 10];
console.log(array[0]);     //배열 0번째 값 호출
var len = array.length; //배열 길이
for (var i = 0; i < len; i++) {
    var value = array[i];
    if ((value % 2) == 0) {
        console.log(value)
    }

    const EVEN = 2;
    for (var i = 0; i < len; i++) {
        var value = array[i];
        if ((value % EVEN) == 0) {
            console.log(value)
        }
    }
    //최대값 구하기 
    var max = 0;
    for (var i = 0; i < len; i++) {
        if (max < array[i]) {
            max = array[i];
        }
    }
    console.log('최대값은 ---->' + max);
    

}