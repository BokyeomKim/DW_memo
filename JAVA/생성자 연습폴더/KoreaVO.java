package 생성자;

public class KoreaVO {

	// 2-1.Private String location ; //지역이름
	// 2-2.Private String addr; //주소
	// 2-3.Private String name; //지역 대표자
	// 2-4.Private int count; //지역수
	// 3.모든 필드변수 get,set //함수 만들기

	private String location; // 지역이름
	private String addr;// 주소
	private String name;// 지역 대표자

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private int count;// 지역수
}
