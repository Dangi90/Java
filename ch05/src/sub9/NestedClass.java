package sub9;
/**
 * 날짜 : 24/07/11
 * 이름 : 박준우
 * 내용 : 중첩클래스 실습하기
 */

//외부클래스
class Outer{
	
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("Outer x = " +x);
	}
	
	//내부클래스
	class Inner{
		private int x;
		
		public Inner(int x){
			this.x = x;
		}
		
		public void show() {
			System.out.println("Inner x = " +x);
		}
	}
}

interface Person{
	public void hello(); //추상메서드 선언
}

public class NestedClass {
	public static void main(String[] args) {
		
		//외부객체 생성
		Outer out = new Outer(1);
		out.show();
		
		//내부객체 생성
		sub9.Outer.Inner inn = out.new Inner(2);
		inn.show();
		
		//익명객체 실습 - 인터페이스를 클래스 구현없이 바로 new 생성한 객체
		Person p =new Person() {
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
				
			}
		};
		p.hello();
	}

}