package �÷�����;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {
		// ctrl+shift+o Array list import�ҷ�����
		// <> : ���׸�
		ArrayList<String> list = new ArrayList<String>(); // ()������

		// add : �����͸� list�� ����
		list.add("�ñ�ġ �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			System.out.println(value);

			if (value.equals("��â�Ľ�Ÿ")) {
			}
			++count;
		}
		System.out.println(count);

		// int �� ��� Arraylist
//		list2.remove(); // ()�ȿ� x��° �����͸� �־��ָ� �����Ͱ� �����ǰ� ���� �����Ͱ� ������ �̵��ȴ�.�����͸��� �ּҰ� �ִµ� �ּҸ� �Ѱܹ������ν� �ּҸ� ���� �̵��Ѵ�.(list)
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);

		// ����1. list �߰��� ���� ���� ���ϱ�
		int sum = 0;
		for (int i = 0; i < list2.size(); i++) {
			int value = list2.get(i);
			System.out.println(value);
			if (list2.get(i) != 40) {
				sum += list2.get(i);
			}
		}
		System.out.println("������ : " + sum);

	}

}
