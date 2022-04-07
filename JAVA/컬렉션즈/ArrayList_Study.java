package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {
		// ctrl+shift+o Array list import불러오기
		// <> : 제네릭
		ArrayList<String> list = new ArrayList<String>(); // ()생성자

		// add : 데이터를 list에 삽입
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			System.out.println(value);

			if (value.equals("곱창파스타")) {
			}
			++count;
		}
		System.out.println(count);

		// int 를 담는 Arraylist
//		list2.remove(); // ()안에 x번째 데이터를 넣어주면 데이터가 삭제되고 뒤의 데이터가 앞으로 이동된다.데이터마다 주소가 있는데 주소를 넘겨받음으로써 주소를 보고 이동한다.(list)
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);

		// 문제1. list 추가된 숫자 총합 구하기
		int sum = 0;
		for (int i = 0; i < list2.size(); i++) {
			int value = list2.get(i);
			System.out.println(value);
			if (list2.get(i) != 40) {
				sum += list2.get(i);
			}
		}
		System.out.println("총합은 : " + sum);

	}

}
