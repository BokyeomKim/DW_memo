//json
var information={
    "name": "홍길동",
    "age": 23
};
//json 출력
console.log(information.age);
// json 포맷 
// key : 중복 x , value : 값(중복 가능, 데이터 타입)
var dwacademy = {
    student: ['오승택', '류근환', '강인석', '김보겸', '이인서', '나정수','정지유','김민영','이규성','이승섭','이상협','홍준호','유영준'],
    teacher: '현상원',
    today: '2022-03-08',
    student_count: 15,
    subject: ['SQL', 'JAVA', 'HTML']
};
//json 값 호출
console.log(dwacademy.student_count);
//json 배열 호출
console.log(dwacademy.student_count[1]);
//문제1 student_count 가 15 이하면 학생 수 부족 , 15 초과하면 학생 수 정상

if (count <= 15) {
    console.log('학생 수 부족');
} else {
    console.log('학생 수 정상');
}

//문제 2. 학생 중 이씨 몇 명인지?

var cnt = 0;
var searchword = '이';
for (var i = 0; i < dwacademy.student.length; i++){
    var firstName = dwacademy.student[i].substring(0, 1);
    if (firstName == searchword){
        ++cnt;
    }
}

console.log('이씨는 총' + cnt);
var array = [2, 5, 7, 8];
console.log(array[1]);
var arrayjson = {
    array: [2,5,7,8]
}
console.log(arrayJson.array[1]);