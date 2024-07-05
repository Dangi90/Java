package sub6;
/**
 *  날짜 : 04/07/01
 *  이름 : 박준우
 *  수업 : ch3 예제 실습
 */

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+80;
		System.out.println("점수:"+score);
		
		String grade;
		
		if(score>=90) {
			if (score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		
		}else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
			
		}
	System.out.println("학점: "+grade);	
	}

}
