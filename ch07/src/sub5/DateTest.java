package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 날짜 : 24/07/16
 * 이름 : 박준우
 * 시간 : 자바 DATE 클래스 실습하기
 */
public class DateTest {
	public static void main(String[] args) {
		
		// DATE 클래스
		Date date = new Date();
		System.out.println("date : " +date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		System.out.println("result : " +result);
		
		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		
		int yy 	= cal.get(Calendar.YEAR);
		int mm 	= cal.get(Calendar.MONTH)+1; //1월을 0으로 인식
		int dd 	= cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%02d년 %02d월 %02d일 %02d:%02d:%02d",yy ,mm, dd, hour, min, sec);
		
		
	}
}
