자바 (객체지향 언어)
1. if /else ,for ,while , 배열(공통)
2. 메소드, 클래스(자바 특징)
	(python, javascript, c++)
3. 제네릭 컬렉션 (자바 특징)
-----------------------------------------------------------------------------------------------------
package study;

public class 연습장 {// for 문 복습,자바 문자 비교 

	public static void main(String[] args) {

		String id = "JAVA";
		String id_2 = "JAVA";
		int age = 33;

		if (id.equals("java")) {

			System.out.println("아이디가 맞습니다.");
		} else

		{
		}
		System.out.println("아이디가 다릅니다.");
		{

		}
		if (id == id_2) {
			System.out.println("아이디가 맞습니다.");
		} else {
			System.out.println("아이디가 다릅니다.");
		}

	}
}








----------------------------------------------------------------------------------

package study;

public class 연습장2 {

	public static void main(String[] args) {

		String id = "USER_ID";
		String id_2 = new String("user_id";)
		String password = "123";
		// == 문자를 비교할때 equals 를 써야한다 .
		//자바는 데이터 타입 9개 일반 8개와 클래스 타입 
		
		
		if (id.equals("USER_ID")) {
			System.out.println("아이디가 맞습니다.");
		} else {
			System.out.println("아이디가 다릅니다.");
		}
	}
}








String ==은 비교하고자 하는 두개의 대상의 주소(위치)값을 비교함.
(*Call by Reference)
equals 는 비교하고자 하는 두개의 대상의 값 자체를 비교.(*Call by Value)
------------------------------------------------------------------------------
< 배열 >

int num = 10;
		int num2 = 10;
		int num3 = 10;
		int num4 = 10;
		int num5 = 10;
		int num6 = 10;
		int num7 = 10;
		int num8 = 10;
		int num9 = 10;
		int num10 = 10;   	//방지 하기 위해 사용 하는것이 배열 이다.




반복문과 배열은 친구 다. 
반복문 만 사용하는 경우는 거의없다.




package study;

public class 연습장3 {

	public static void main(String[] args) {
		//배열 
		int array[] = {2,4,6,9};
		System.out.println(array[1]); //첫번째 배열 (인덱스) 호출 
		System.out.println(array.length); //배열의 길이 호출 
		//System.out.println(array[4]); //에러 
		
		for(int i = 0; i<array.length; ++i) {//i=0 / array(길이4)작으니 아래 출력 실행
			System.out.println("배열에 있는 인덱스 값은 :"+array[i]);//i는 ++i 더하면서 출력됨.
		}
		
	}
}


-----------------------------------


package study;
//배열길이 만큼 홀수 판단
public class 연습장3 {

	public static void main(String[] args) {
		
		int array[] = {2,4,6,9};
		for(int i=0; i<array.length; i++) {
		
			if((array[i]%2) !=0){
				System.out.println(array[i]);
		}
		
		}
		
	}
}



-----------------------------------
public static void main(String[] args) {
		int num = 10;
		int 배열[] = {10,3,5};
		System.out.println(배열[2]);
}
---------------------------------결과 값 5

	public static void main(String[] args) {
		int num = 10;
		int 배열[] = {10,3,5};
		System.out.println(배열[2]);
		배열[0]=5;//0번째 데이터에 5를 대입
		배열[1] = 배열[1]*3;// 1번째 데이터 *3
	



3의배수 개수를 찾아내시오.
		int count = 0;
		int array[] = { 3, 6, 9, 10, 1 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				count++;

			}
		}System.out.println(count);

아래 배열을 선언하고, 배열 인덱스 중 가장 큰 수를 찾아내시오.
		int array[] = { 5, 11, 2, 0, 7 }; //
		int size = array.length;
		int max = 0; // 최댓값을 담을 그릇 .
		for (int i = 0; i < size; i++) {

			if (max < array[i]) {// 0번째인 5를 호출 . max 와 비교//max 가 array 보다 크다면
				max = array[i]; // array 값을 max 에 대입

			}

		}
		System.out.println("max=>" + max);
	}

}




향상된 for 문 <each>
for(int i : array) : 알아서 증가 해주겠지.
=
for(int i : array) {
		System.out.print(i+" ");
---------------------------------------------------------------------
for (int i = 0; i < array.length; i++) {
			int x = array[i];
			System.out.println(x);
		}



--이해 해야----

for(int i=0; i<2; i++)
for(int j=0; j<3; j++) {




아래 배열을 선언하고 정렬하시오. 
		int array[] = {5,11,2,0,7}; 
		int size = array.length;
		int temp = 0;
			for(int i = 1; i<size; i++) {
				for (int j=0; j<size-1; j++) {
					if(array[i] <array[j]) {
				temp = array[i]	;
				array[i] = array[j];
				array[j] = temp; 
버블 정렬
Arrays.sort(array)// 졍렬 끝 





package study;
----핵심은 이거!
public class 연습장3 {

	public static void main(String[] args) {
	//배열을 왜 쓰는지?
		int x = 100; // 100 번 만들어라 !!!!
		int x1  =100; // 변수 100번까지 만들래?;
		int 배열[] = {10,7};// 선언식. //100이라는 것을 서랍(바구니)에 넣을거.
											//서랍 번호 는 0,1,2,3  = 4개 
		int size = 배열.length; // 결과는 2! 장바구니 의 사이즈 
		int y 배열[0] ;//0번째 인덱스(서랍에서 꺼낸 수)를 다른 데이터(y)에 대입 하고 싶으면
		int z = 배열[1];
		int a = 배열[2]; // {0,1,2}세번째 거가 없으니까 오류 가 나...
		//
		int temp = 0;  //{10}우선 temp 에다 값 대입(보관) 
		temp = 배열[0];
		배열[1] = 배열 [0];  // {10,10}
		배열[0] = temp ; //10 temp 의 데이터를 0번째 에 넣으니까.
		
		//{10,7,3}
		배열[1] = 배열[2]+배열 [0];
		//=>배열 1의 값은? 13 
		
		배열 [0]= 베열[2]; // 3
		배열 [2]= 배열[0]; // 3 에 10 대입 
		//배열 2의 값은 ? 10
		
		
	}
}
		
		
