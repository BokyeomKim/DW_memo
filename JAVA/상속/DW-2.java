package 상속;

//항상 클래스 이름 앞에는 대문자!
public class Dw {
	String name;	//학생 이름
	String className; //과정 이름
	int studentCount;  //학생 수 
	//source> getter setter
	
	public Dw() {
		
	}
//	생성자 특징
	//1 . 생성자 이름은 클래스 이름과 동일
	//2. return type 이 없다.
	public Dw(String name, String className, int studentCount)
	{
	this.name =name;
	this.className = className;
	this.studentCount =studentCount;
			
	}
	
	
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
	
}
