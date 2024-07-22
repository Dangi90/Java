package sub1;

public class Account {
	
	// 속성 변수 선언
	String bank;
	String acc;
	String name;
	int balance;
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.acc);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
	
	/*
	 * show 결과
	 * 은행명 : xx
	 * 계좌번호 : xx
	 * 입금주 : xx
	 * 현재잔액 : xx
	 */
}

}
