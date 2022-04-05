package 상속;

public class Home {

	public static void main(String[] args) {
		

		Dw dw = new Dw("김준수", "반응형개발",13); // 인스턴스화하다.(==파일을 불러오다)
		System.out.println(dw.name);
		System.out.println(dw.className);
		System.out.println(dw.studentCount);
		
		Dw dw02 = null;
//	가능하다. 초기값으로 null 을 넣을 수있다. 
		if(dw02==null){
			dw02 = new Dw();
		}
//	같은 로직. null 이면 클래스 호출
		int x= 0;
		if(x == 0) {
			x=10;
		}
	}

}
