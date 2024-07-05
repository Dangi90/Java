package ch02.sec01to10;

public class Ex3 {
	
	public static void main(String[] args) {
		byte res1 = 10 + 20;	//컴파일 단계에서 연산
		System.out.println("result1 = "+res1); 
		
		byte v1 = 10;
		byte v2 = 20;
		int res2 = v1 + v2;		//int타입으로 변환 후 연산
		System.out.println("result2 = "+res2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long res3 = v3 + v4 + v5 ;
		
		System.out.println("result3 = "+res3);
		
		
		System.out.println();
		
		int value = 3 + 7;
		String str = "3" + "7";
		
		System.out.println(value);
		System.out.println(str);

	}

}
