1.클래스는 필드변수(전역변수)와 메소드로 구성. 

2. 필드변수 앞에는 접근지정자. 
public,private,protected,default public

3.자바에서 클래스는 객체(==object)다.

4.객체는 고유한 특성과 행동을 가짐.

	ex.) 학교 
	특성
  1. 학생 수 
  2. 교직원 수
  3. 반 수

	행동
  1.수업을 듣다.
  2.선생님한테 혼나다.
  3.교장선생님 연설을 듣다.

5.객체를 하는 이유
1. 업무 분담을 위해서
2. 일 효율성을 위해서

학교 s = new 학교();
### new 를 사용해야
학교 클래스 안에 있는 필드변수와 메소드
사용가능. 

class Pizza(){
	public String 피자종류; //필드변수

	public void 피자를 먹다();{//메소드
	this.피자종류 = "치즈피자";
	}
}
############ 생성자
Pizza p = new Pizza();


실무에서 생성자 대신 사용하는 방법
(책에 안나옴.)
//1. 필드변수 접근 지정자에 private으로 선언
//2. 각 변수들마다 함수를 만들어 줌. 

보일러 플레이트 코드 
: 노가다 작업을 쉽게 해줌 .


*****실무에서 
1.생성자로 필드변수 초기화 잘 안함.
2. get, set 함수 이용해서 필드변수 초기화
3.set , get 함수가 있는 클래스에는 절대(never) 다른 함수를 정의하지 않는다.  
4. 클래스이름 뒤에 VO(Value Object)를 붙이자 
	클래스 이름 뒤에 DTO(Data Transfer Object)를 붙이자 .



UML (Unified Modeling Language)
통합 모델링 언어. 
즉, 모델을 만드는 표준 언어.

소프트웨어 초기 스케치 작업 
*****사용하는 이유 
1. 다른 사람들과 의사소통 또는 설계 논의 
2. 전체 시스템 파악 
3. 유지보수를 위한 설계의 back-end 문서
