package 클라쓰;

public class 이태원클라쓰 {
	//총 이태원 클라쓰는 필드(전역)변수 2개와 메소드 1개가 구성됨.
	//필드변수가 2개 
	//실무에서는 private으로 함!
	public String 주인공; //은닉성.
	public String 동료;
	//메소드가 1개 
	public void 학교를때려치다(String name) {
	//앞에 this 가 붙은 변수는 필드변수로 생각!
		this.주인공 = name; 
		System.out.println(name+"가 학교를 나갔습니다...");
	}
	

	
}
