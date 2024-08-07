package bank.app;

public class Account extends BankApp{
	
	String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void show() {
	    System.out.println("계좌번호: " + ano + ", 이름: " + owner + ", 잔액: " + balance);
	}
	
}
