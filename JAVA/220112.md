p.s_ String 앞에 대문자로 써야돼


JAVA 
//변수 
1. 프로그램을 만들기 위해 코딩을 해요!
2. 프로그램 데이터가 있으니까 
변수라는 개념을 이용해서 데이터를 대입해야 해요.

3. int(데이터 타입) x(변수 이름) = 정수형 데이터 ; 

변수를 많이 선언 하면 메모리가 찬다. 그래서 변수를 재활용 하는것 !



package study;

public class Lol {
	public static void main(String[] args) {
		String 캐릭터 = "아무무" ;
		int 레벨 = 6;
		레벨 = 레벨 +1; // 1대입 
		레벨 = 1;//2렙 
		//사칙연산 <*,/,%,+,->
		레벨 = 레벨+레벨; // 함축해서 레벨 +=레벨 o 
		레벨 += 레벨;// 3렙 
		++레벨 ; // 증감 연산자 1만 더해주는것.
		//아무무 렙은 ? 4렙
		System.out.println(캐릭터+"레벨은" +레벨+"입니다");

		//삼항 연산자  
		//비교 연산자  == (100%)
		
	}

}

ctrl +d = 한번에 지우기 



public static void main(String[] args) {
		//if(만약에) /else (아니라면) 가정~ 
		int x = 5;
		int y = 6;
		
		if(x==y) // 맞다면 
		{ 
			System.out.println("x랑 y는 같아요!");
		}
		else{ 
			System.out.println("x랑 y는 달라요!");
		}
		
			
		}
	
}



else 많이 쓰면 안좋은 코드,
생각을 한번 더 하면 안좋은 코드입니다.. 클린코드 에도 명시 되어있다.

가장 마지막에 쓴 if 의 else 다 .



package study;

public class Lol {

	public static void main(String[] args) {
		// A학점 100~91
		// B학점 80~89
		// C학점 70~79
		// D학점 69 이하
		int myScore = 87; // C학검

		if (myScore >= 90) {
			System.out.println("A학점입니다.");
		}
		if (myScore >= 90 && myScore >= 80) {
			System.out.println("B학점입니다.");
		}
		if (myScore >= 80 && myScore >= 70) {
			System.out.println("C학점입니다");
			{
			}
		}
	}
}





else if 많이 쓰면 안좋음.  코드가 이쁘게 내려와야 하는데 , 사선으로 가면 지옥..;

package study;

public class Lol {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 5;

		if (x != y) {
			System.out.println("다릅니다");
			if (x == z) {
				System.out.println("같습니다");
			} else if (4 == 4) {
				System.out.println("같습니다");
			}

		}
	}
}
안좋은 예 사선으로 코드가 짜여진다.



아래 문제 예시 x와 y가 다르다면!합산   같기때문에 0인거
package study;

public class Lol {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int num = 0;
		if (x != y) {
				num = x + y ; 
		}
		System.out.println(num);
	}
}



package study;

public class Lol {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int num = 0;
		if (x == y) {
				num = x + y ; 
		}
		num = 0;    // 20이 되었으나, 0대입, 결과 값 0
		System.out.println(num);
	}
}
---------------------------------
package study;

public class Lol {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int num = 0;
		if (x != y) {
			num = x + y;
		} else {
			num += num; // num+num 대입
			System.out.println(num);
		}
	}
}


--------------------------------------------------------


중괄호 { where 조건 


package study;

public class Lol {

	public static void main(String[] args) {
		int x = 10;  	
		int y = 10;
		int num = 0;
		if (x == y) {
			num = x * y;
			//------------------같다면 10*10 =>100
		if (x!= y) {  //다르니까 else 실행
		} else {
			num = num*2;
		}
		//100*2 = 200
		}else {
				num+=num;
			}
		num = num+100;
		//200+100 = 300
		System.out.println("num의 값은? "+num);
	}
}

-----------------------------------------------------------------------------
짝수 홀수 구별 

package study;

// 짝수인지 홀수인지 구별하는 프로그램 구현 
//조건1/ if /else 로 풀것.
//조건2 변수는 value 만 
//조건3 사칙연산을 이용해서 풀것
//조건4 사칙연산 중에 %을 사용 할것 
public class Lol {

	public static void main(String[] args) {
		int value = 100;
		if ((value % 2) == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}

-----------------------------------------------------------------------
좋아하는 숫자를 입력하세요.


package study;

import java.util.Scanner;

public class 스캐너 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			//ctrl + shift + o
		System.out.println("이름을 입력하세요=>");
		String name = scan.next(); //문자를 입력할때 
		System.out.println("좋아하는 숫자를 입력하세요+>");
		int num = scan.nextInt();
		System.out.println("안녕하세요 제이름은 "+name+"입니다");
		System.out.println("제가 좋아하는 숫자는"+num+"입니다.");
	}

}



----------------------------------------------------------------
스캐너 와 복합 
package study;

import java.util.Scanner;

public class Lol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좋아하는 숫자를 입력하세요->");
		int value = scan.nextInt();
	
		if ((value % 2) == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}


else 가 헷갈리면 그냥 
if(3 == 3)
if(3!=3)
방식으로 
else 쓸 거면 else 앞에 }
영토 






--------------------------------------------------------
방법 1 .


if (value >=95)  {
			System.out.println("S");
		}else{
		if( value >=90 && value <95) {
			System.out.println("A");
		}
}


방법 2. 
if(value<95 && value >=90) {
	System.out.println("A");
}
if(value >= 95 && value <=100) {
		System.out.println("S");
}
--------------------------점심 -------------------------------------------------
(else if)


package study;

public class 스캐너 {
	public static void main(String[] args) {
		int num =30;
		if(num ==20) {
			System.out.println("hello");
		}else if(num ==30) {//조건식을 한번 더 사용
			System.out.println("helloworld");
		}
	}
}



package study;

public class 스캐너 {
	public static void main(String[] args) {

		int num =30;
		//방법
		if(num ==20) {
			System.out.println("hello");	
		}else if(num ==40) {//조건식을 한번 더 사용
			System.out.println("helloworld");
		}else {
		}
}
	
// if 를 두번 사용 한 효과
//if else 는 이거 아니면 이거겠지?둘중에 하나는 실행되어야 한다.
//else = 모 아니면 도 
//마지막에 else 를 써준다 (문법상 , n개중에 하나는 맞겠지)
//강제로 다음 조건 실행
//맞겠지?맞겠지2? 다 틀리네?  = else는 무조건 실행
//에라 모르겠다 식


---------------------------------------
package study;

public class 문제 {

	public static void main(String[] args) {
	
		//90점 초과 A, 80점 초과 B, 70점 초과 C,70점 이하는 F
		//조건 . else if 로 풀어볼껏
		int score =88;
		if(score>90) {
			System.out.println("A");
		}else if(score <=90 && score >80) {
			System.out.println("B");
		}else if(score <= 80 && score >70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
	}
}


< if, for 문 >
--------------------------------------------------------------------------
package study;

public class 반복문 {
	public static void main(String[] args) {
		//(if/else), (반복문) 
		//코드의 중복을 제거하고자 반복문 등장!
		//int i = index. 암묵적인 룰. for문에 는 
		for(int i=1; i<=10; ++i) {
			System.out.println("helloworld");
		}

	}

}


------------------------------------------------------------------------------------

	for(int i=1; i<=10; ++i) {
			System.out.println("helloworld");
		}

(int i=1; i<=10; ++i) 해석 
1.int i=1;(초기문 or 선언문 )
2.i<=10; (조건식)
3.++i (반복 작업식)

시험: for 문의 순서를 적으세요
for (int i=0; i<=10; i++){
}
암묵적인 룰. 컴퓨터는 0부터 시작하기 때문에 i를 0으로 지정한다.
실행순서 는 
int i= 0; 
i<10;
for (int i=0; i<=10; ++i){
}

... 코드들 이 세번째 순서 

ex.i<=10;
... 거짓이면 for 문을 실행 안한다.


++i? 이게 뭐여. 이게 4번째 실행 
대입
참인지 거짓인지
실행 하고 {} 중괄호 안에 있는 코드를 실행한다 .
증감(+1) i = 1 
다시 사이클 반복 
int i = 1 이 된것이다. 

10 전 까지 무한 실행 한다 .10 미만 될때 까지  i를 증가 시킨다. 

운동장 10바퀴 돌아 ! 다돌면 쉬는거 


package study;

public class 반복문 {
	public static void main(String[] args) {
		//(if/else), (반복문) 
		//코드의 중복을 제거하고자 반복문 등장!
		//int i = index. 암묵적인 룰. for문에 는 
		for(int i=1; i<=10; ++i) {
			System.out.println("i==>"+i);
		}

	}

}
조건식이 true 일때 까지 
------------------------------------------------------
package study;

public class 반복문 {
	public static void main(String[] args) {
		// 1~10 까지의 짝수를 판별
		// 조건 for 문 사용
		for (int i = 1; i <= 10; ++i) {
			if ((i % 2) == 0)
				System.out.println("짝수는" + i);
		}
	}

}

----------------------------------------------------------

for 문을 벗어나면 생을 마감. for 문 안에서만 사용할수 있다.
