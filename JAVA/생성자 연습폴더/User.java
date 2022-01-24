package »ý¼ºÀÚ;

public class User {

	private int count;

	public boolean setUsername(UserVo vo) {
		System.out.println(vo.getAddr());
		System.out.println(vo.getAge());
		System.out.println(vo.getNickName());
	return true;
	}

	public int updateUser(UserVo vo) {
	return 0;
	}

	public int deleteUser(UserVo vo) {
		return 0;
	}
	public int getUserCount() {
		return count;
	}

	public void setUserCount(int count) {
		this.count = count;
	}
	public UserVo getUser(int id) {
		return null;
	}
}