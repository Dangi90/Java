package ch12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.InputMap;

/**
 * 날짜 : 24/07/24 이름 : 박준우 내용 : HTTP 통신 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedReader br = null;

		try {
			URL url = new URL("https://naver.com");
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");

			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
