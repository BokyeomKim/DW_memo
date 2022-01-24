package 생성자;

public class UserCall {

	private static User user;

	public static void main(String[] args) {
		User user = new User();
		UserVo vo = new UserVo();
		vo.setAddr("대전 충정로 136");
		vo.setAge(50);
		vo.setNickName("몽키.D.길동");
		vo.setName("홍길동");
		user.setUser(vo);
	}

}
