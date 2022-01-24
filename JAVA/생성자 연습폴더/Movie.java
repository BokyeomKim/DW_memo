package 생성자;

public class Movie {
	// 1. 영화관 클래스 생성
	// 클래스 이름은 Movie

	// 2. Movie 클래스에는 3개의 필드변수 존재
	// 2-1. String name; //영화관 이름
	// 2-2. String location; //영화관 위치
	// 2-3. int count; //직원 수

	// 3. Movie 클래스에는 3개의 생성자 존재 (초기화 해줄 것)
	// 3-1. 디폴트 생성자
	// 3-2. 파라미터에 영화관 위치가 있는 생성자
	// 3-3. 파라미터에 모든 필드변수가 오는 생성자

	// 4. 일반 메소드 1개 존재
	// 4-1. 접근지정자가 public 리턴타입이 int 메소드 이름은 getMovie
	// 파라미터는 없음.
	String name; // 영화관 이름
	String location; // 영화관 위치
	int count; // 직원 수

	public Movie() {// 디폴트 생성자
		// 디폴트 생성자를 무시하고 파라미터가 있는 생성자를 만들면
		// 디폴트 생성자는 없어짐. 사용하고 싶으면 만들어야 함.
	}

	public Movie(String location) {
		this.location = location;
	}

	public Movie(String name, String locatation, int count) {
		this.name = name;
		this.count = count;
		this.location = location;
	}

	public int getMovie() {
		return 0;
	}
}
