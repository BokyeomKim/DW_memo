package ���;

public class Home {

	public static void main(String[] args) {
		

		Dw dw  = new Dw(); 
		dw.setName("���ؼ�");
		dw.setClassName("������");
		dw.setStudentCount(13);
		
		String name = dw.getName();
		System.out.println("�л� �̸��� :" +name);
		String className = dw.getClassName();
		System.out.println("���� �̸��� :"+className);
		int studentCount = dw.getStudentCount();
		System.out.println("�л��� : "+studentCount +"��");
	
	}

}
