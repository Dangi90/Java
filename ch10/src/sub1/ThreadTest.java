package sub1;

/**
 * 날짜 : 24/07/22 이름 : 박준우 내용 : 자바 쓰레드 실습
 */

public class ThreadTest {

	public static void main(String[] args) {

		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");

		//작업스레드 시작.
		sub1.start();
		sub2.start();
		// sub1, sub2 쓰레드가 서로 병행되면서 실행

		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread 실행...");

			try {
				Thread.sleep(1000); //스레드 1초대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("main Thread 종료");
	}

}
