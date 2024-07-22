package sub2;

class SubThread extends Thread {

	@Override
	public void run() { // 작업 스레드로 처리할 매서드

		int i = 1;

		try {
			for (;;) {
				System.out.println("Work Thread 실행... " + i);

				i++;

				Thread.sleep(1000); // 스레드 1초대기
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		// System.out.println("Sub Thread 종료");
	}
}

public class ThreadInterruptTest {

	public static void main(String[] args) {

		SubThread sub = new SubThread();

		sub.start();

		try {
			Thread.sleep(1000 * 10); // 메인스레드 10초 대기 (일시정지)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sub.interrupt(); // ThreadInterrupt을 발생시켜서 내부적으로 발생종료

		System.out.println("Main Thread 종료...");
	}
}
