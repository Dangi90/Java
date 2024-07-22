package sub3;

public class InheritanceStudy {
	
	public static void main(String[] args) {
		Doctor doctor = new Doctor("김유신", 33, "소아과");
		Engineer engineer = new Engineer("김춘추", 30, "소프트웨어");
	
		doctor.work();
		engineer.work();
	
	}
}
