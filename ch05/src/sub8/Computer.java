package sub8;

public class Computer {
	public void boot() {
		System.out.println("부팅..");
	}

}


interface Internet{
	public void access();
}

class Tv extends Computer implements Internet{
	
	public void show() {
		System.out.println("TV 시청...");
	}

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
		
	}
}