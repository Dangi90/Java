package sub7;

import java.util.Scanner;

/**
 *  날짜 : 04/07/01
 *  이름 : 박준우
 *  수업 : ch3 예제 실습
 */

public class KeyCOntrolExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("----------------=-------");
			System.out.println("1. 종속 : 2. 감속 : 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택: ");
		
			String strNum = scanner.nextLine();
		
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if(strNum.equals("2")){
				speed--;
				System.out.println("현재속도: " + speed);
			}
			else if(strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
