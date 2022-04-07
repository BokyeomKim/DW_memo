package 컬렉션즈;

import java.util.ArrayList;

class Student {
	String name;
	int age;
	String addr;

	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int setAge() {
		return this.age;
	}
	

}

public class ArrayList_study2 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 26, "부산");
//		System.out.println(s1.name);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1); // 0번째에 s1 이 들어감. student 클래스 추가

		String name = list.get(0).name; // Student 클래스 필드변수 불러옴
		System.out.println(name);
		int age = list.get(0).getAge(); // Student 클래스 메소드(함수)불러옴
		System.out.println(age);
		list.get(0).setAge(33);
		System.out.println(age);
		age = list.get(0).getAge();
		System.out.println(age);
	}

}
