package sub5;

import java.util.Scanner;

/**
 *  날짜 : 04/07/01
 *  이름 : 박준우
 *  수업 : ch3 예제 실습
 */

public class TotalExample {
	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요");
		
		Scanner sc= new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A등급 입니다.");
		}
		else if(score>=80) {
			System.out.println("B등급 입니다.");
		}
		else if(score>=70) {
			System.out.println("C등급 입니다.");
		}
		else if(score>=60) {
			System.out.println("D등급 입니다.");
		}
		else {
			System.out.println("E등급 입니다.");
		}
		
	}

}
