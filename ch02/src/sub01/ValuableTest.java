package sub01;
 /*
 * 날짜 : 24/06/28 
 * 이름 : 박준우
 * 내용 : ch02. 변수와 연산자
 *  
  */

public class ValuableTest {
	
	public static void main(String[] args) {
		
		//변수
		int a = 1; //변수 선언과 초기화
		int b = 2; //변수 재할당
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a= 3;
		
		System.out.println("a : " +a);
		
		//상수
		
		final int NUM = 10; // 상수는 대문자 표시 사용
		
		/* 
		 * int num = 7;
		 * int가 상수로 바뀌어서 에러 처리
		 */
		
		System.out.println("int = " +NUM);
		
	}

}
