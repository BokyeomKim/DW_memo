package ������;

public class KoreaVO {

	// 2-1.Private String location ; //�����̸�
	// 2-2.Private String addr; //�ּ�
	// 2-3.Private String name; //���� ��ǥ��
	// 2-4.Private int count; //������
	// 3.��� �ʵ庯�� get,set //�Լ� �����

	private String location; // �����̸�
	private String addr;// �ּ�
	private String name;// ���� ��ǥ��

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private int count;// ������
}
