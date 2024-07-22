package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 날짜 : 24/07/18 이름 : 박준우 내용 : 프로퍼티 실습하기
 * 
 * 프로퍼티(Properties) - 문자열을 데이터만 취급하는 key-value 자료구조 클래스 - 직렬화 , 역직렬화를 이용해 데이터를
 * 입출력하는 자료구조 클래스 - 프로그램 환경설정값을 저장할 때 많이 사용
 */

public class PropertiesTest {

	public static void main(String[] args) {
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Apple");
		prop.setProperty("C", "Apple");

		System.out.println(prop);

		////////////////////////////////////////////////
		// 프로퍼티 직렬화(파일저장)
		String path = "C:\\Users\\lotte4\\Desktop\\fuit.properies";

		try {

			FileOutputStream fos = new FileOutputStream(path);

			// 직렬화
			prop.store(fos, null);

			// 스트림 해제
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		////////////////////////////////////////////
		// 프로퍼티 역직렬화(파일 읽기)
		String path2 = "C:\\Users\\lotte4\\Desktop\\city.properties";

		Properties cityProp = new Properties();

		try {

			FileInputStream fis = new FileInputStream(path2);
			
			// 역직렬화
			cityProp.load(fis);

			// 스트림 해제
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(cityProp);
		System.out.println("한국 : " + cityProp.getProperty("kor"));
		System.out.println("미국 : " + cityProp.getProperty("usa"));
		System.out.println("일본 : " + cityProp.getProperty("jpn"));
		

		System.out.println("프로그램 종료...");

	}
}
