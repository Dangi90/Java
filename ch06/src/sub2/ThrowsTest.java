package sub2;

import java.util.Scanner;

public class ThrowsTest {
	public static void main(String[] args) {
		
		int num = 1;
		
		try {
			//method1에서 예외가 발생하면 예외처리
			method1(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
	//method1에서 예외가 발생하면 method1를 호출하는 곳으로 예외 던지기
	public static void method1(int num) throws Exception {
		method2(num);
	}
	
	//method2에서 예외가 발생하면 method2를 호출하는 곳으로 예외 던지기
	public static void method2(int num) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("num2 입력: ");
		
		int num2 = scan.nextInt();
		//intputMissMatchException 발생가능
		int result = num / num2;
		//ArtimesticException 발생가능
		
		System.out.println("result: " +result);
	}

}
