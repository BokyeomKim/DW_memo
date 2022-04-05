package 상속;

public class Home {

	public static void main(String[] args) {
		

		Dw dw  = new Dw(); 
		dw.setName("김준수");
		dw.setClassName("반응형");
		dw.setStudentCount(13);
		
		String name = dw.getName();
		System.out.println("학생 이름은 :" +name);
		String className = dw.getClassName();
		System.out.println("과정 이름은 :"+className);
		int studentCount = dw.getStudentCount();
		System.out.println("학생수 : "+studentCount +"명");
	
	}

}
