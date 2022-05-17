package 컬렉션즈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class OneSoju{
	
}

public class Hash_Study {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list2 = new LinkedList<String>();
		
		OneSoju onesoju= new OneSoju();
			
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		HashMap<String,Object> map2 = new HashMap<String,Object>();
		
		
		map.put("1", "참이슬"); // Hashmap 에 데이터 넣기 !
		map.put("2", "처음처럼");
		map.put("a", "한라산");
		map.put("b", 13);  
		System.out.println(map.get("1"));// key이름으로 value 접근 
		//문제1 . 한라산 출력하기 
		System.out.println(map.get("a"));
	}

}
