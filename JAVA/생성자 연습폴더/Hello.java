package 생성자;

public class Hello {
	public static int getSum(int x){
		return x;
	}
	public static void main(String[] args) {
		String pizza = "치즈피자";
		Pizza p = new Pizza(pizza);//*생성자에 파라미터 값이 있으면 메소드와 동일하게 파라미터 값을 넣어야 함. 
		
		String result = p.피자종류;
		System.out.println(result);
	
	
	}
}
