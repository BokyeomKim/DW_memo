package 연습;
//메소드의 다양한 형태
public class Method {

	public void method1() {
		System.out.println("1번 실행");
	}
	public void method2(int x) {
		System.out.println(x+"를 이용한 2번실행");
	}
	
	public int method3() {
		System.out.println("3번실행");
		return 10;
	}
	public void method4(int x, int y) {
		System.out.println(x+y+"4번실행");
	}
	
	public  int method5(int y) {
		System.out.println(y+"를 이용한 5번실행");
	
		return y*2;
	
	}
}
