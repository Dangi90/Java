package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 날짜 : 24/07/15
 * 이름 : 박준우
 * 내용 : 예외처리 실습하기
 */

public class ExceptionTest {
	
	public static void main(String[] args) {
		///////////////////////////////////////		
		//실행 예외 (프로그램 실행 중 발생 예외)
		///////////////////////////////////////
		//예외상황 1. 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			// 예외가 발생할 코드로직 작성
			r4 = num1 / num2;
		}catch (ArithmeticException e) {
			// 예외가 발생 했을 때
			e.printStackTrace(); // 예외출력
		}
		
		System.out.println("r1 : " +r1);
		System.out.println("r2 : " +r2);
		System.out.println("r3 : " +r3);
		System.out.println("r4 : " +r4);
		
		//예외상황 2. 배열의 인덱스 참조가 잘못 되었을 떄	
		int [] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i=0 ; i<10 ; i++) {
				System.out.println("arr{"+i+"] : " +arr[i]);
			}
		
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//예외상황 3. 객체 생성 없이 메서드 호출
		Animal ani = null;
		
		try {
			ani.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//예외상황 4. 잘못된 캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		try {
		Tiger tiger = (Tiger)a1;
		Shark shark = (Shark)a2; //잘못된 다운캐스팅
		
		tiger.move();
		shark.move();
		}catch (ClassCastException e) {
			e.printStackTrace();;
		}
		
		///////////////////////////////////////		
		//일반 예외(컴파일 타임, 프로그램 실행 전 발생 예외)
		///////////////////////////////////////	
		
		//동적 객체 생성
		try {
			//예외가 발생할 코드
			Class clazz = Class.forName("sub1.Eagle");
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			try {
				Eagle eagle = (Eagle) constructor.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			//예외가 발생 했을 떄
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//예외처리 발생여부와 상관없이 마지막에 항상 실행
			System.out.println("finally 실행...");
		}
		
		System.out.println("프로그램 종료...");
	}

	private static void getDeclaredConstructor() {
		// TODO Auto-generated method stub
		
	}
}
