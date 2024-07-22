package sub8;

public class Cable implements Socket{
	
	private Bulb bulb;

	public Cable(Bulb bulb2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void switchOn() {
		bulb.lightOn();
		
	}

	@Override
	public void sitchOff() {
		bulb.lightOff();
		
	}

}
