package ������;

public class Movie2 {

	public static void main(String[] args) {
		

		Movie m= new Movie();// <new> : Ŭ���� ȣ�� (��üȭ �ϴ�.)
								//Ŭ���� �̸�(): Ŭ���� ������ ȣ�� 
		m.count = 10;
		System.out.println(m.count);
		
		Movie m2 = new Movie("���� ���� �ƿ﷿ �ް��ڽ�"); //m,m2 ������ : ���� class , m2 location ���� �ϰ� count ���� x
				System.out.println(m2.location);
				
		m2.location = "�����͹̳� CGV";		
		System.out.println(m2.location);
		Movie m3 = new Movie();
		m3.location = "���� ������ CGV";
		System.out.println(m3.location);//����Ŭ���� �� �̿�
	}

}
