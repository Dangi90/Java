package sub3;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/**
 * 날짜 : 24/07/16
 * 이름 : 박준우
 * 내용 : ArrayList 실습하기
 */

public class ArrayListTest {
	public static void main(String[] args) {
		
		//ArrayList 생성
		List<Integer> list = new ArrayList<>();
		
		//데이터 저장
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		// 데이터 삽입
		list.add(1,6); //1번 자리(인덱스)에 6 삽입
		System.out.println(list);
		
		//데이터 제거
		list.remove(0); //인덱스 0번 데이터 제거
		System.out.println(list);
		
		list.remove(3); // 인덱스 3번 데이터 제거
		System.out.println(list);
		
		//데이터 출력
		System.out.println("list 1번째 원소 : " +list.get(0));
		System.out.println("list 1번째 원소 : " +list.get(1));
		System.out.println("list 1번째 원소 : " +list.get(3));
		
		//리스트 크기
		System.out.println("list 크기 : " +list.size());
		
		//리스트 반복문
		for(int num: list) { // auto-unboxing
			System.out.print(num + ",");
		}
		
		System.out.println();
		
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		//마지막에 '정약용' 추가
		people.add("정약용"); // 마지막은 인덱스 번호 생락 가능
		
		//강감찬 - 이순신 사이에 '이성계' 추가
		people.add(4,"이성계");
		
		//김유신 - 김춘추 사이에 '선덕여왕' 추가
		people.add(people.indexOf("김춘추"),"선덕여왕");
		System.out.println(people);
		
		//'장보고'제거 후 '왕건'삽입
		people.remove(people.indexOf("장보고"));
		people.add(3,"왕건");
		System.out.println(people);
		
		//'이성계'를 '정도전'으로 교체
		people.set(people.indexOf("이성계"),"정도전");
		System.out.println(people);

		//객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("미국",2000);
	
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본",1000));
		
		//한국사과출력
		System.out.println(a1);
		
		//일본사과출력
		Apple appleJAPAN = apples.get(2);
		System.out.println(apples.get(2));
		
	}	
}
