package sub1;
/**
 * 날짜 : 24/07/08
 * 이름 : 박준우
 * 내용 : 클래스와 객체 실습하기
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car(); //Car클래스 변수선언 & sonata 인스턴스 생성
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		// 두번째 객체 생성
		Car avante = new Car();
		
		avante.name = "아반떼";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account();
		
		// 객체 초기화
		kb.bank = "국민은행";
		kb.acc = "1002-508-24";
		kb.name = "김유신";
		kb.balance = 10000;
		
		//객체 활용
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.acc = "1010-22-1001";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		wr.deposit(5000);
		wr.show();
		
		
				
		
		
	}

}
