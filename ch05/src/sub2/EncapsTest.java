package sub2;
/**
 * 날짜 : 24/07/08
 * 이름 : 박준우
 * 내용 : 캡슐화 실습하기
 */
public class EncapsTest {
	
	public static void main(String[] args) {
		
		// Car 객체 생성과 초기화를 같이 진행
		Car sonata = new Car("소나타", "흰색", 0);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.setClolor("은색");
		sonata.show();
		
		Car avante = new Car("아반뗴", "검정", 0);
		
		avante.speedUp(100);
		avante.speedDown(50);
		avante.show();
	
		Account kb = new Account("국민은행", "1002-204-01", "김유신", 10000);
		kb.show();
		
		kb.setBank("국빈은행");
		kb.setName("김유진");
		kb.show();
	
		
		//연습문제
		
		Book java = new Book("이것이 자바다", "신용권", "121-11-1001",3);
		Book sql = new Book("혼자공부하는 sql", "우재남", "112-11-1201", 2);
					
		if(java.borrowBook()) {
			System.out.println("대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		java.show();
		sql.show();
		
		//연습문제 2
		
		NationalPeople np1 = new NationalPeople
				("한국", "박준우", 34, "010-4043-7777");
		NationalPeople np2 = new NationalPeople
				("영국", "루니", 40, "704-589-5548");
		
		np1.show();
		np2.show();
		
		np2.setAge(44);
		np2.setCellNumber("찾을 수 없음");
		np2.show();
		
		Sedan sonata2 = new Sedan("소나타", "흰색", 0, 2000);
		sonata2.speedUp(100);
		sonata2.speedDown(40);
		sonata2.show();
	}
				
}
