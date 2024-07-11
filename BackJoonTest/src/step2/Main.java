package step2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		//boolean result;
		
		//System.out.print("a: ");
		A = sc.nextInt();
		//System.out.print("b: ");
		B = sc.nextInt();
		//C = sc.nextInt();
		
		
		if(B>=45) {
				System.out.print(A+" "+(B-45)); 
		}else if(A>=1 && B<45){
				System.out.print((A-1)+" "+(B+15));
		}else {
			System.out.print((A+23)+" "+(B+15));
		}
		
		sc.close();
	}

}
