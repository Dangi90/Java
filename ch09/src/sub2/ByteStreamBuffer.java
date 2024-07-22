package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamBuffer {
	
	public static void main(String[] args) {

		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";

		// 버퍼로 이용한 byte 배열
		byte[] buffer = new byte[1024]; // 1KB

		try {
			// 입력 스트림 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);

			while (true) {

				// 파일 읽기
				int data = fis.read(buffer); // 한번에 1KB 단위로 읽음.

				if (data == -1) {
					// 더이상 읽을 내용이 없을 경우
					break;
				}

				// 파일쓰기
				fos.write(buffer, 0, data);
			}

			// 스트림 해제

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
