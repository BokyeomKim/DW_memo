package ������;

public class UserCall {

	private static User user;

	public static void main(String[] args) {
		User user = new User();
		UserVo vo = new UserVo();
		vo.setAddr("���� ������ 136");
		vo.setAge(50);
		vo.setNickName("��Ű.D.�浿");
		vo.setName("ȫ�浿");
		user.setUser(vo);
	}

}
