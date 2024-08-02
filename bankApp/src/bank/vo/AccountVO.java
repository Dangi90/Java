package bank.vo;

public class AccountVO {
	private String aNo;
	private String aItemDist;
	private String aItemName;
	private String aCNo;
	private String aBalance;
	private String date;
	
	public AccountVO() {}

	public AccountVO(String aNo, String aItemDist, String aItemName, String aCNo, String aBalance, String date) {
		super();
		this.aNo = aNo;
		this.aItemDist = aItemDist;
		this.aItemName = aItemName;
		this.aCNo = aCNo;
		this.aBalance = aBalance;
		this.date = date;
	}
	
	public String getaNo() {
		return aNo;
	}
	public void setaNo(String aNo) {
		this.aNo = aNo;
	}
	public String getaItemDist() {
		return aItemDist;
	}
	public void setaItemDist(String aItemDist) {
		this.aItemDist = aItemDist;
	}
	public String getaItemName() {
		return aItemName;
	}
	public void setaItemName(String aItemName) {
		this.aItemName = aItemName;
	}
	public String getaCNo() {
		return aCNo;
	}
	public void setaCNo(String aCNo) {
		this.aCNo = aCNo;
	}
	public String getaBalance() {
		return aBalance;
	}
	public void setaBalance(String aBalance) {
		this.aBalance = aBalance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "AccountVO [aNo=" + aNo + ", aItemDist=" + aItemDist + ", aItemName=" + aItemName + ", aCNo=" + aCNo
				+ ", aBalance=" + aBalance + ", date=" + date + "]";
	}
	
	
} 
