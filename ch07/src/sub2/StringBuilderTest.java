package sub2;
/**
 * 날짜 : 24/07/16
 * 이름 : 박준우
 * 내용 : 자바 StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String 불변(immutable) 특성
		String str = "JAVA";
		System.out.println("str주소 : " +System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str주소 : " +System.identityHashCode(str));
		
		System.out.println("str : " +str);
		
		//String의 불변 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("JAVA");
		
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("str : " +str);
	}

}
