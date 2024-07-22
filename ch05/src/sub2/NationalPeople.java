package sub2;

public class NationalPeople {
	
	//속성변수 선언
	private String nation;
	private String name;
	private int age;
	private String cellNumber;

	//생성자
	public NationalPeople (
			String nation, 
			String name,
			int age,
			String cellNumber) 
	{
		this.nation = nation;
		this.name = name;
		this.age = age;
		this.cellNumber = cellNumber;
	}
	
	
	public void show() {
		System.out.println("------------------");
		System.out.println("국가: "+this.nation);
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("폰번호: "+this.cellNumber);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
}
