package bank.vo;

public class TransactionVO {
	
	private int		tNo;
	private String 	tANo;
	private int		tDist;
	private int 	tAmount;
	private String 	tDatetime;
	
	public TransactionVO() {}
	
	public TransactionVO(int tNo, String tANo, int tDist, int tAmount, String tDatetime) {
		super();
		this.tNo = tNo;
		this.tANo = tANo;
		this.tDist = tDist;
		this.tAmount = tAmount;
		this.tDatetime = tDatetime;
	}

	public int gettNo() {
		return tNo;
	}

	public void settNo(int tNo) {
		this.tNo = tNo;
	}

	public String gettANo() {
		return tANo;
	}

	public void settANo(String tANo) {
		this.tANo = tANo;
	}

	public int gettDist() {
		return tDist;
	}

	public void settDist(int tDist) {
		this.tDist = tDist;
	}

	public int gettAmount() {
		return tAmount;
	}

	public void settAmount(int tAmount) {
		this.tAmount = tAmount;
	}

	public String gettDatetime() {
		return tDatetime;
	}

	public void settDatetime(String tDatetime) {
		this.tDatetime = tDatetime;
	}

	@Override
	public String toString() {
		return "TransactionVO [tNo=" + tNo + ", tANo=" + tANo + ", tDist=" + tDist + ", tAmount=" + tAmount
				+ ", tDatetime=" + tDatetime + "]";
	}
	
	
}
