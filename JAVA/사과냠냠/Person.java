public class Person {

	public static void main(String[] args) {	
        
		Apple apple = new Apple();

		System.out.println("현재 사과는 : "+apple.getAppleCount()+"개 있습니다.");
		apple.buyApple(20);
		if(apple.getAppleCount() > 0){
			System.out.println("현재 사과는 : "+apple.getAppleCount()+"개 있습니다.");
			apple.eatApple(30);
			System.out.println("현재 사과는 : "+apple.getAppleCount()+"개 있습니다.");
			apple.buyApple(20);
			System.out.println("현재 사과는 : "+apple.getAppleCount()+"개 있습니다.");
			apple.eatApple(30);
			System.out.println("현재 사과는 : "+apple.getAppleCount()+"개 있습니다.");
		}
		
	}
}
