package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiseTest {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",3000);
		
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(apple);
			
			fos.close();
			oos.close();
			
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
