package sub3;
/**
 * 	날짜 : 24/07/01
 * 	이름 : 박준우
 * 	내용 : 반복문 for 실습
 * 
 */

public class ForTest {
	
	public static void main(String[] args) {
		 
		// for
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("i = " +i);
		}
		// 1부터 10까지 합
		
		int sum = 0;
		for(int k=1 ; k<=10 ; k++) {
			sum += k;
			System.out.println("sum1 = " +sum);
		}    
		// 1부터 10까지 짝수 합
			int sum1 = 0;
			for(int j=1 ; j<=10 ; j++) {
			
			if(j%2 == 0) {
			sum1 += + j;
			System.out.println("sum1 = " +sum1);
			}
		}
		
		// for 중첩
			
			for(int a=1 ; a<=3 ; a++) {
				System.out.println("a는: "+a);
				for(int b=1 ; b<=5 ; b++) {
					System.out.println("b는: "+b);
				}
			}
			
		// 구구단
			
			for(int a=1 ; a<=9 ; a++) {
				System.out.println(a+"단");
				for(int b=1 ; b<=9 ; b++) {
					int x = a*b;
					System.out.println(a+"X"+b+"="+x);
				}
			}
			
		// 별삼각형
			
			for(int start=10 ; start>=1 ; start--) {
				
				for(int end=1 ; end<=start ; end++) {
					System.out.print("☆");
				}
				System.out.println();
				
			}
		
		
		
		
		
	}

}
