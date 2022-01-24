package 생성자;
//실무에서 필드변수 데이터 대입하는 방법
public class 일식당 {
	//1.필드변수 접근지정자에 private으로 선언
	private String porkCutlet; //돈까스
	private String price;//가격
 // 단축키 alt + shift + s //generate getter and setter
	
	
	public String getPorkCutlet() {
		return porkCutlet;
	}
	public void setPorkCutlet(String porkCutlet) {
		this.porkCutlet = porkCutlet;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}


}

