package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();

		//데이터 저장
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		
		
		//반복자를 이용한 데이터 출력
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			//다음 데이터가 있을 떄 까지 반복
			System.out.print(it.next()+", ");
			
		}
	
	}
}
