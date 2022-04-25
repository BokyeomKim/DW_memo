package test;
//결과 화면

//클래스 이름 : 스마트웹 & 앱 과정 , 학생이름 : 홍길동

class Dw {
	String className;
	String studentName;

	public Dw() {

	}

	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}

public class 긴급점검2 {
	public static Dw printStudent() {
		return new Dw("스마트웹 & 앱과정", "홍길동");
	}

	public static void main(String[] args) {
		// 방법 1
		Dw d = printStudent();
		System.out.println("방법:1"+d.className + "," + d.studentName);
		// 방법2
		System.out.println("방법2:"+printStudent().className);
		System.out.println("방법2:"+printStudent().studentName);
	}
}
