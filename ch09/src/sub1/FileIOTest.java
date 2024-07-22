package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 24/07/18
 * 이름 : 박준우
 * 내용 : 파일 입출력 스트림 실습하기
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte4\\Desktop\\sample1.txt";
		String target = "C:\\Users\\lotte4\\Desktop\\sample2.txt";
		
		try {
			//입력 스트림 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			
			while(true) {
			//파일 읽기
				int data = fis.read();
				
				if(data == -1) {
					//더이상 읽을 내용이 없을 경우
					break;
				}
				
				char ch = (char) data;
				//파일 읽은 내용 그대로 출력
				//System.out.println(data);
				System.out.println(ch);
				
				//파일쓰기
				fos.write(data);

			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
		
	}

}
