package sub2;
/**
 * 날짜 : 24/07/22 이름 : 박준우 내용 : 자바 쓰레드 실습
 */
class WorkThread extends Thread{
	
	@Override
	public void run() { //작업 스레드로 처리할 매서드
		for (int i = 0; i < 10; i++) {
			System.out.println("Work Thread 실행");
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

public class ThreadJoinTest {
	
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		work.start();
		
		try {
			work.join(); //작업중인 스레드 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main Thread 종료...");//프로그램 종료
	}

}
