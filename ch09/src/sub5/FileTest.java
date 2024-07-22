package sub5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileTest {

	public static void main(String[] args) {

		String path1 = "C:\\Users\\lotte4\\Desktop\\souce.txt";
		String path2 = "C:\\Users\\lotte4\\Desktop\\temp";

		// File 객체 생성
		File f1 = new File(path1);
		File f2 = new File(path2);

		try {

			f1.createNewFile(); // 파일생성
			f2.mkdir(); // 디렉터리 생성

			// 파일 정보 출력
			System.out.println("f1 존재여부 : " + f1.exists());
			System.out.println("f2 존재여부 : " + f2.exists());
			System.out.println("f1 파일여부 : " + f1.isFile());
			System.out.println("f2 파일여부 : " + f2.isFile());
			System.out.println("f1 폴더여부 : " + f1.isDirectory());
			System.out.println("f2 폴더여부 : " + f2.isDirectory());
			System.out.println("f1 파일명  : " + f1.getName());
			System.out.println("f2 파일명  : " + f2.getName());
			System.out.println("f1 경  로	 : " + f1.getPath());
			System.out.println("f2 경  로  : " + f2.getPath());
			System.out.println("f1 절대경로 : " + f1.getAbsolutePath());
			System.out.println("f2 절대경로 : " + f2.getAbsolutePath());

			f1.delete();
			f2.delete();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Files 실습(바탕화면에 source.txt 파일 만들어 놓을것)
		Path source = Paths.get("C:\\Users\\java\\Desktop\\Source.txt");
		Path target = Paths.get("C:\\Users\\java\\Desktop\\Target.txt");
		Path destination = Paths.get("C:\\Users\\java\\Desktop\\Temp\\Destination.txt");

		try {
			// 복사
			Files.copy(source, target);

			// 이동
			Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);

			// 삭제
			Files.delete(target);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");
	}

}