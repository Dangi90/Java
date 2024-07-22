package sub4;

public class MethodOverRidingTest {
	
	public class AAA{
		public void method1() {
			System.out.println("AAA::method1");
		}
		
		public void method2() {
			System.out.println("AAA::method1");
		}
		
		public void method3() {
			System.out.println("AAA::method1");
		}
	}
	
	public class BBB extends AAA{
		public void method2() {
			System.out.println("BBB::method2");
		}
		
		public void method3(int a) {
			System.out.println("BBB::method3");
		}
	}
	
	// 오버라이드
	public class CCC extends BBB{
		public void method1() {
			System.out.println("CCC::method1");
		}
		
		public void method2() {
			System.out.println("CCC::method2");
		}
		
		public void method3(int a,int b) {
			System.out.println("CCC::method3");
		}
		
	}
	
	public static void main(String[] args) {
		
		//매서드 오버로딩 & 오버라이딩 실습
		
		/*
		 * CCC c = new CCC();
		 * 
		 * c.method1(); c.method2(); c.method3(); c.method3(1); c.method3(1,2);
		 */
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.show();
	}

}
