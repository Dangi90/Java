package sub2;

class Sub1Thread extends Thread {

	@Override
	public void run() { // 작업 스레드로 처리할 매서드
		for (int i = 0; i < 1000; i++) {
			System.out.println("Sub1 Thread 실행 " + i);

			Thread.yield();// 다른스레드에게 실행을 양보
			//sub2의 우선순위가 더 높게 실행됨.
		}
	}
}

class Sub2Thread extends Thread {

	@Override
	public void run() { // 작업 스레드로 처리할 매서드
		for (int i = 0; i < 1000; i++) {
			System.out.println("Sub2 Thread 실행 " + i);

		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {

		Sub1Thread sub1 = new Sub1Thread();
		Sub2Thread sub2 = new Sub2Thread();

		sub1.start();
		sub2.start();

		System.out.println("main 쓰레드 종료...");
	}

}
