package �÷�����;

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
		Student s1 = new Student("ȫ�浿", 26, "�λ�");
//		System.out.println(s1.name);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1); // 0��°�� s1 �� ��. student Ŭ���� �߰�

		String name = list.get(0).name; // Student Ŭ���� �ʵ庯�� �ҷ���
		System.out.println(name);
		int age = list.get(0).getAge(); // Student Ŭ���� �޼ҵ�(�Լ�)�ҷ���
		System.out.println(age);
		list.get(0).setAge(33);
		System.out.println(age);
		age = list.get(0).getAge();
		System.out.println(age);
	}

}
