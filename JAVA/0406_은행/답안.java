package 은행문제풀이;


class Account{ //계좌
	int deposit; //입금
	int withdraw; //출금
	int totalMoney; //잔고
	
	//getter, setter
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) { //입금
		System.out.println("입금한 금액은 =>"+deposit+"원 입니다.");
		this.deposit += deposit; //총 입금 금액
		this.totalMoney += deposit; //내 잔액
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) { //출금
		if(this.totalMoney < withdraw){
			System.out.println("이체할 수 없습니다.");
		}else{
			System.out.println("출금한 금액은 =>"+withdraw+"원 입니다.");
			this.withdraw += withdraw;
			this.totalMoney -= withdraw;
		}
			
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) { //잔액에서 이자 플러스
		this.totalMoney += interest;
	}
	
}

public class Bank { //은행
	
	//이자를 주는 함수
	public static double paidInterestOnAccount(int money){ 
		final double INTEREST_RATE = 0.1;
		return money * INTEREST_RATE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setDeposit(1000);
		if(account.getTotalMoney() > 0){
			System.out.println("현재 잔고 ==> "+account.getTotalMoney() +"원");
			account.setWithdraw(500);
			System.out.println("현재 잔고 ==> "+account.getTotalMoney() +"원");
			account.setDeposit(500000); //월급 50만원
			account.setDeposit(500000); //보너스 50만원
			account.setDeposit(500000); //야근수당 50만원
			System.out.println("현재 잔고 ==> "+account.getTotalMoney() +"원");
			int myMoney = account.getTotalMoney();
			if(myMoney >= 1000000){ //입금 후 잔액이 백만원 이상이면
				int interestMoney = (int)paidInterestOnAccount(myMoney);
				System.out.println("이자는 ==> "+interestMoney);
				account.setTotalMoney(interestMoney);
				System.out.println("현재 잔고 ==> "+account.getTotalMoney() +"원");
			}
		}
		
	}
}