package 생성자;

public class 학원2 {
	public static void main(String[] args) {
		학원 h = new 학원();
		int 학생수 = 16;
		System.out.println(h.교사이름);
		System.out.println(h.학생수);
		String 교사이름 = "철수";
		학원 h2 = new 학원(학생수,교사이름);
		System.out.println(h2.교사이름);
		System.out.println(h2.학생수);
	}

}
