package sub2;

/*
 * 날짜 : 24/06/28 
 * 이름 : 박준우
 * 내용 : 자바 출력 실습하기 
 * 
 */

public class PrintTest {
	
	public static void main(String[] args) {
		
		// 기본출력
		
		System.out.println("Hello JAVA!");
		System.out.println("Hello KOREA!");
		System.out.println("Hello BUSAN!");
		
		// 한줄출력
		
		System.out.print("Welcome"); //ln(줄바꿈) 처리가 안되었기 때문에 그 다음 출력문이 이어서 출력됨.
		System.out.print("JAVA");
		
		
		// 개행처리
		System.out.println(); // 줄바꿈
		System.out.println("Welcome\n"); // \n(이스케이프 문자)로 개행처리 
		System.out.println("KOREA~");
	}

}
