package 상속;

class HamburgerFactory {
	String pattyName;
	int money;
	
	public String getPattyName() {
		return pattyName;
	}
	public void setPattyName(String pattyName) {
		this.pattyName = pattyName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public HamburgerFactory() {
		
	}
	public HamburgerFactory(String pattyName, int money) {
		this.pattyName = pattyName;
		this.money = money;
	}
	public void HamburgerFactory(String pattyName, int money) {
		System.out.println(pattyName+","+money);
	}
}

public class Hamburger {
	public static void main(String[] args) {
		HamburgerFactory ham = new HamburgerFactory();

		//방법 1. 실무에서 private으로 접근을 막아 보통 사용x
		ham.pattyName = "새우";
		ham.money = 3000;
		System.out.println(ham.pattyName+","+ham.money);
		ham.pattyName = "불고기";
		ham.money = 2500;
		System.out.println(ham.pattyName+","+ham.money);
		ham.pattyName = "치킨";
		ham.money = 4000;
		System.out.println(ham.pattyName+","+ham.money);
		ham.pattyName = "치즈";
		ham.money = 3000;
		System.out.println(ham.pattyName+","+ham.money);
		
		System.out.println();
		
		// 방법 2. 
		HamburgerFactory shi = new HamburgerFactory("새우",3000);
		HamburgerFactory bul = new HamburgerFactory("불고기",2500);
		HamburgerFactory chi = new HamburgerFactory("치킨",4000);
		HamburgerFactory che = new HamburgerFactory("치즈",3000);
		System.out.println(shi.pattyName+","+shi.money);
		System.out.println(bul.pattyName+","+bul.money);
		System.out.println(chi.pattyName+","+chi.money);
		System.out.println(che.pattyName+","+che.money);
		
		System.out.println();
		
		// 방법 3. getter / setter 사용 ***** 실무에서 많이 사용
		ham.setPattyName("새우");
		ham.setMoney(3000);
		System.out.println(ham.pattyName+","+ham.money);
		ham.setPattyName("불고기");
		ham.setMoney(2500);
		System.out.println(ham.pattyName+","+ham.money);
		ham.setPattyName("치킨");
		ham.setMoney(4000);
		System.out.println(ham.pattyName+","+ham.money);
		ham.setPattyName("치즈");
		ham.setMoney(3000);
		System.out.println(ham.pattyName+","+ham.money);
		
		System.out.println();
		
		// 방법 4. Method 사용
		ham.HamburgerFactory("새우", 3000);
		ham.HamburgerFactory("불고기", 2500);
		ham.HamburgerFactory("치킨", 4000);
		ham.HamburgerFactory("피즈", 3000);
	}
}