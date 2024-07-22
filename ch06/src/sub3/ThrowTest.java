package sub3;
/**
 * 날짜 : 24/07/15
 * 이름 : 박준우
 * 내용 : 예외 발생 시키기 실습
 */

class scroe{
	
	public void check(int score) throws Exception {
		if(score<0) {
			//예외 발생 시키기
			throw new Exception("점수는 음수가 될 수 없습니다.");		
		}else if(score>100) {
			throw new Exception("점수는 100점을 초과할 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니다.");
		}		
	}
}

public class ThrowTest {
	
	public static void main(String[] args) {
		
		
	}

}
