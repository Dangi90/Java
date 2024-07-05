package sub3;

/**
* 날짜 : 24/06/28 
* 이름 : 박준우
* 내용 : 연산자 실습하기
*  
*/

public class OperatorTest {
	
	public static void main(String[] args) {
		
		// 산술연산자
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		
		System.out.println("result1 = " +result1);
		System.out.println("result2 = " +result2);
		System.out.println("result3 = " +result3);
		System.out.println("result4 = " +result4);
		System.out.println("result5 = " +result5);
		
		// 증감연산자
		
		int num = 0;
		
		num++; // 1증가
		
		System.out.println("num = " +num);
		
		num++; // 1증가
		
		System.out.println("num = " +num);
		
		num--; // 1감소
		num--; // 1감소
		
		System.out.println("num = " +num);
		
		//최종값 0 
		
		// 복합연산자
		
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		n1 += 1; // n1(1) + 1 = 2
		n2 -= 2; // n2(2) - 2 = 0
		n3 *= 3; // n3(3) * 3 = 9
		n4 /= 4; // n4(4) / 4 = 1
		
		System.out.println("n1 = " +n1);
		System.out.println("n2 = " +n2);
		System.out.println("n3 = " +n3);
		System.out.println("n4 = " +n4);
				
		
		// 비교연산자
		
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;
		boolean rs2 = var1 < var2;
		boolean rs3 = var1 >= var2;
		boolean rs4 = var1 <= var2;
		boolean rs5 = var1 == var2; // 값이 똑같다
		boolean rs6 = var1 != var2; // 값이 다르다
		
		System.out.println("rs1 : " +rs1);
		System.out.println("rs2 : " +rs2);
		System.out.println("rs3 : " +rs3);
		System.out.println("rs4 : " +rs4);
		System.out.println("rs5 : " +rs5);
		System.out.println("rs6 : " +rs6);
		
		
		// 논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); // 그리고 (&&) false 앞 연산이 F고 뒷 연산이 T라서
		boolean res2 = (var3 > 2) && (var4 > 2); // true
		boolean res3 = (var3 > 3) || (var4 > 3); // 또는 (||)
		boolean res4 = (var3 > 4) || (var4 > 4); // 또는 (||)
		boolean res5 = !(var3 > var4);
		
		System.out.println("res1 : " +res1);
		System.out.println("res2 : " +res2);
		System.out.println("res3 : " +res3);
		System.out.println("res4 : " +res4);
		System.out.println("res5 : " +res5);
		
		
		
		
		
		
		System.out.print("종료");
		
		
	}

}
