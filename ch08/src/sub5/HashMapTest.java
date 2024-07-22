package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
        // Map 선언 (HashMap 사용)
		Map<String, ArrayList<String>> map = new HashMap();
		
        // ArrayList 선언 및 초기화
		ArrayList<String> fruits1 = new ArrayList<>();
		fruits1.add("Apple");
		fruits1.add("Banana");
		
		ArrayList<String> fruits2 = new ArrayList<>();
		fruits2.add("Orange");
		fruits2.add("Peach");
		
		//Map에 ArrayList 추가
		map.put("List1", fruits1);
		map.put("List2", fruits2);
		
		//Map 출력
		System.out.println(map);
		
        // 특정 키의 ArrayList 가져오기
		ArrayList<String> list1 = map.get("List1");
		System.out.println("List1 : "+list1);
		
		//ArrayList에 요소 추가
		list1.add("Cherry");
		System.out.println("Modified List1: " +list1);
		
		// Map의 전체출력
		System.out.println("Updated: " +map);
		
		for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			String Key = entry.getKey();
			ArrayList<String> values = entry.getValue();
			System.out.println("key: " + Key + ", Values : " +values);
			
			for(String value : values) {
				System.out.println(" ," + value);
			}
		}
		
		
	}
}
