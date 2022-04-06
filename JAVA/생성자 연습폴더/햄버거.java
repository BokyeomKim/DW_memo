package ���;

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

		//��� 1. �ǹ����� private���� ������ ���� ���� ���x
		ham.pattyName = "����";
		ham.money = 3000;
		System.out.println(ham.pattyName+","+ham.money);
		ham.pattyName = "�Ұ��";
		ham.money = 2500;
		System.out.println(ham.pattyName+","+ham.money);
		ham.pattyName = "ġŲ";
		ham.money = 4000;
		System.out.println(ham.pattyName+","+ham.money);
		ham.pattyName = "ġ��";
		ham.money = 3000;
		System.out.println(ham.pattyName+","+ham.money);
		
		System.out.println();
		
		// ��� 2. 
		HamburgerFactory shi = new HamburgerFactory("����",3000);
		HamburgerFactory bul = new HamburgerFactory("�Ұ��",2500);
		HamburgerFactory chi = new HamburgerFactory("ġŲ",4000);
		HamburgerFactory che = new HamburgerFactory("ġ��",3000);
		System.out.println(shi.pattyName+","+shi.money);
		System.out.println(bul.pattyName+","+bul.money);
		System.out.println(chi.pattyName+","+chi.money);
		System.out.println(che.pattyName+","+che.money);
		
		System.out.println();
		
		// ��� 3. getter / setter ��� ***** �ǹ����� ���� ���
		ham.setPattyName("����");
		ham.setMoney(3000);
		System.out.println(ham.pattyName+","+ham.money);
		ham.setPattyName("�Ұ��");
		ham.setMoney(2500);
		System.out.println(ham.pattyName+","+ham.money);
		ham.setPattyName("ġŲ");
		ham.setMoney(4000);
		System.out.println(ham.pattyName+","+ham.money);
		ham.setPattyName("ġ��");
		ham.setMoney(3000);
		System.out.println(ham.pattyName+","+ham.money);
		
		System.out.println();
		
		// ��� 4. Method ���
		ham.HamburgerFactory("����", 3000);
		ham.HamburgerFactory("�Ұ��", 2500);
		ham.HamburgerFactory("ġŲ", 4000);
		ham.HamburgerFactory("����", 3000);
	}
}