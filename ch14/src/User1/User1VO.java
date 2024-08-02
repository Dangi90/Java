package User1;

public class User1VO {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public User1VO() {
		
	}
	
	public User1VO(String uid, String name, String hp, int age) {
		super();
		this.uid = uid;
		this.name = name;
		this.hp = hp;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User1Vo [uid=" + uid + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
