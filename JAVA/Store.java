package 상속;


class Store_sub{
	int money; // 객체(인스턴스화)가 생성~ 죽음까지 유지
	
	//필드변수는 메소드를 활용해서 접근해야 한다.
	public int sumMoney(int money) {
		int sum  = this.money += money;// this : StoreSub   .money (파라미터)
				return sum;
	}
}

public class Store {
	public static void main(String[] args) {
		// 실무에서는 필드변수를 직접 접근하지 않는다.
		Store_sub s = new Store_sub();
		int result = s.sumMoney(100);
		result = s.sumMoney(100);
		System.out.println(result);
	}

}
