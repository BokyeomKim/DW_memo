package 생성자;

public class Movie2 {

	public static void main(String[] args) {
		

		Movie m= new Movie();// <new> : 클래스 호출 (객체화 하다.)
								//클래스 이름(): 클래스 생성자 호출 
		m.count = 10;
		System.out.println(m.count);
		
		Movie m2 = new Movie("대전 현대 아울렛 메가박스"); //m,m2 공통점 : 같은 class , m2 location 대입 하고 count 대입 x
				System.out.println(m2.location);
				
		m2.location = "대전터미널 CGV";		
		System.out.println(m2.location);
		Movie m3 = new Movie();
		m3.location = "대전 가오동 CGV";
		System.out.println(m3.location);//같은클래스 만 이용
	}

}
