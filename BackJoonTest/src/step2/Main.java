package step2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		boolean result;
		
		A = sc.nextInt();
		//B = sc.nextInt();
		//C = sc.nextInt();
		
		if(A%4==0) {
			if(A%100!=0 | A%400==0) {
				System.out.print("1"); 
			}else {
				System.out.println("0");
			}
		
		}else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
