package sub3;

/**
 * 날짜 : 24/07/22 이름 : 박준우 내용 : 스레드 동기화 실습
 */

/*
 * 동기 vs 비동기
 * - 동기(Syncronize)는 일련의 로직을 순서대로 처리하는 흐름
 * - 비동기(Asyncronize)는 일련의 로직을 순서를 지키지 않고 처리하는 흐름
 */
public class ThreadSyncTest {
	public static void main(String[] args) {

		Count count = new Count();

		CountThread ct1 = new CountThread();
		CountThread ct2 = new CountThread();
		CountThread ct3 = new CountThread();

		try {
			ct1.start();
			ct2.start();
			ct3.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("count : " + count.getNum);
	}
}
