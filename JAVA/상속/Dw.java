package 상속;

//항상 클래스 이름 앞에는 대문자!
public class Dw {
	String name;	//학생 이름
	String className; //과정 이름
	int studentCount;  //학생 수 
	//source> getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	// 1. 생성자에 파라미터 없이 필드변수 초기화 
	// getter, setter
}
