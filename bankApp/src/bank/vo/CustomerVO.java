package bank.vo;

public class CustomerVO {
	private String cNo;
	private String cName;
	private int cDist;
	private String cPhone;
	private String cAddr;
	
	public CustomerVO() {}
	
	public CustomerVO(String cNo, String cName, int cDist, String cPhone, String cAddr) {
		super();
		this.cNo = cNo;
		this.cName = cName;
		this.cDist = cDist;
		this.cPhone = cPhone;
		this.cAddr = cAddr;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcDist() {
		return cDist;
	}

	public void setcDist(int cDist) {
		this.cDist = cDist;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}

	public String getcAddr() {
		return cAddr;
	}

	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}

	@Override
	public String toString() {
		return "CustomerVO [cNo=" + cNo + ", cName=" + cName + ", cDist=" + cDist + ", cPhone=" + cPhone + ", cAddr="
				+ cAddr + "]";
	}
	
	
	
	
}
