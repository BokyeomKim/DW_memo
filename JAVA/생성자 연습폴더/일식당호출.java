package 생성자;

public class 일식당호출 {

	public static void main(String[] args) {

		일식당 a = new 일식당();
		a.setPorkCutlet("안심돈까스"); //setting 줄임말.
		String 돈까스 = a.getPorkCutlet();//set 한 데이터를 get 
		System.out.println(돈까스);
	
		일식당 b = new 일식당();
		//1.set 메소드 먼저
		a.setPorkCutlet("치즈돈까스"); //setting 줄임말.
		//2. get 메소드로 리턴값 호출 
		String 치즈돈까스 = a.getPorkCutlet();//set 한 데이터를 get 
		System.out.println(치즈돈까스);
		
	}

}
