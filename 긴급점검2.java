package test;
//��� ȭ��

//Ŭ���� �̸� : ����Ʈ�� & �� ���� , �л��̸� : ȫ�浿

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

public class �������2 {
	public static Dw printStudent() {
		return new Dw("����Ʈ�� & �۰���", "ȫ�浿");
	}

	public static void main(String[] args) {
		// ��� 1
		Dw d = printStudent();
		System.out.println(d.className + "," + d.studentName);
		// ���2
		System.out.println(printStudent().className);
		System.out.println(printStudent().studentName);
	}
}