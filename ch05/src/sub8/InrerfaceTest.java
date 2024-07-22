package sub8;
/**
 * 날짜 : 24/07/11
 * 이름 : 박준우
 * 내용 : 인터페이스 실습하기
 */
/*
 * interface 클래스는 추상 메서드만 가질 수 있음
 * 인터페이스: 	-표준화된 클래스 설계에 사용되는 구조체
 * 			-오직 추상 메서드만 선언
 *			-인터페이스를 활용해서 다형성을 구현하고 객체간 결합도를 완화
 *			-다중상속 효과
 */			
public class InrerfaceTest {
	public static void main(String[] args) {
		
		//인터페이스 실습1 - 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.chDown();
		lg.SoundUp();
		lg.SoundDown();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.chDown();
		samsung.SoundUp();
		samsung.SoundDown();
		samsung.powerOff();
		
		//인터페이스 실습2 - 다형성 예제
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		/*
		 * socket.switchOn(); socket.sitchOff();
		 */
		
		//인터페이스 실습3 - 다중 상속 효과 예제
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
		
	}

}
