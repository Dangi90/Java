package test1;

public class Test03 {

	public static void main(String[] args) {
		
		int num = 0;
		int result = 0;				
		
		result = num++;
		System.out.println("reslut : " +result);
		
		result = ++num;
		System.out.println("reslut : " +result);
		
		result = num--;
		System.out.println("reslut : " +result);
		
		result = --num;
		System.out.println("reslut : " +result);
	}
}
