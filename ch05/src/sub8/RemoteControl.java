package sub8;

public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp(); // abstract 생략가능
	public void chDown();
	
	public void SoundUp();
	public void SoundDown();

}
