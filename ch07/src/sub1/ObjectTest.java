package sub1;
/**
 * 날짜 : 24/07/15
 * 이름 : 박준우
 * 내용 : 자바 Object 클래스 싈습하기
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("일본", 3000);
		
		// toString() - 객체정보 조회
		System.out.println(a1);
		System.out.println(a2);
		
		// equals() - 객체비교
		if(a1 == a2) {
			System.out.println("a1, a2의 주소값(참조값) 같다.");
		}else {
			System.out.println("a1, a2의 주소값(참조값) 다르다.");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1, a2의 객체가 같다.");

		}else {
			System.out.println("a1, a2의 객체가 다르다.");
		}
		
		//객체 해시값(유일값)
		System.out.println("a1해시값 : " + a1.hashCode());
		System.out.println("a2해시값 : " + a2.hashCode());
	}

}
