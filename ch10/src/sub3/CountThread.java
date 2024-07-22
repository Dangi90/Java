package sub3;

public class CountThread extends Thread {

	private int num;

	public int getNum() {
		return num;
	}

	// 동기화 블럭
	public synchronized void setNum() {
		// 임계영역 : 멀티스레드에 의해 공유자원들이 참조되는 영역
		num++;
	}
	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}


