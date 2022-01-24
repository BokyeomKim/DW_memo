package 생성자;

public class Pizza {

	String 피자종류;// 필드변수
	
	public int getSum(int x, int y) {// 일반 메소드
		return 0;
	}
	public Pizza() { // 오버로딩으로 매개변수가 없는 특수함수(생성자)만듬
	}

	public Pizza(String 피자종류, int 피자가격) { // 클래스를 생성하면 디폴트 생성자가 존재(특수 메소드)
		// 1.리턴타입이 없음. 함수 이름은 클래스 이름과 동일.
		// 2.when : 필드변수에 값을 대입할 때 사용.
		// 3.파라미터에 데이터를 받을 수 있음.
		// 메소드 안에 지역변수는 파라미터 변수이름과 동일할 수 없음. 
		this.피자종류 = 피자종류;// 필드변수에 값을 대입할 때 사용.				
		this.피자가격 = 피자가격; 
	}

}
