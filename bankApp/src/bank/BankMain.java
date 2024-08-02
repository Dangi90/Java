package bank;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("은행에 오신것을 환영합니다.");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 시작:1");
			System.out.println("선택>");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if (answer == 1) {
				break;
			}else if (answer == 2) {
				
			}else if (answer == 3) {
				
			}else if (answer == 4) {
				
			}else if (answer == 5) {
				
			}//end if
			
		}// end while
		
		sc.close();
		System.out.println("프로그램 종료합니다.");
		
	}

}
