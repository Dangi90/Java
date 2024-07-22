package sub8;

public class Bulb {
	
	private Bulb bulb;
	
	public void Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	public Bulb() {
		// TODO Auto-generated constructor stub
	}

	public void lightOn() {
		System.out.println("전구 불 켜짐...");
	}
	
	public void lightOff() {
		System.out.println("전구 불 꺼짐...");
	}

}
