package sub4;

/**
 * 날짜 : 24/07/22 
 * 이름 : 박준우 
 * 내용 : 스레드 제어 실습 교재: p.617 ~ 619
 */

class SubThread extends Thread{

	private String name;
	public SubThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
}

public class DaemonThreadTest  {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread("Sub");
	}

}
