package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DeserialiseTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			//역직렬화
			ois.readObject();
			
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		System.out.println("프로그램 종료 ...");
	}
}
