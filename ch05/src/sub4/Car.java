package sub4;

//클래스 정의 (속성 -> 생성자 -> 메서드)
public class Car {
	
	// 속성은 무조건 private 선언
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자(constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	//Setter, Getter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드
	public void setClolor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
		
	// 기능(멤버 메서드)
	public void speedUp(int speed) { //전연 메서드가 아닌 멤버메서드기 떄문에 static 생략
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("차량명:"+this.name);
		System.out.println("차량색상:"+this.color);
		System.out.println("현재속도:"+this.speed);
	}
}
