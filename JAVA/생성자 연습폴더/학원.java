package 생성자;

public class 학원 {
	// 1.학원이라는 클래스 생성
	// 2.필드변수 종류
	// (1)int 학생 수
	// (2)String 교사이름
	// 3. 생성자 2개 생성 (생성자 생성 후 필드변수 초기화)
	// (1) 디폴트 생성자
	// (2) int 와 String 을 받는 생성자 .
	int 학생수; // 필드변수는 자동으로 default 대입 0
	String 교사이름;// null
	
	
	public 학원() {
	}
	
	
	public 학원(int 학생수,String 교사이름) {
		this.학생수 = 학생수;
		this.교사이름 = 교사이름;
	}

}
