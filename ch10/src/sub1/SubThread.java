package sub1;

import javax.xml.transform.stax.StAXSource;

public class SubThread extends Thread {

	private String name;

	public SubThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { //작업 스레드로 처리할 매서드
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " Thread 실행");
			try {
				Thread.sleep(1000); // 스레드 1초대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Sub Thread 종료");
	}

}
