package test1;

class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;

	public StudentScore(String studentName, String studentId, String subject, double score) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentScore [studentName=" + studentName + ", studentId=" + studentId + ", subject=" + subject
				+ ", score=" + score + "]";
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void printStudentInfo() {

		System.out.println("학생이름: " + this.studentName);
		System.out.println("학생ID: " + this.studentId);
		System.out.println("과목: " + this.subject);
		System.out.println("점수: " + this.score);
		
	}

	public void updateScore(double newScore) {
		if (newScore < 0 || newScore > 100) {
			System.out.println("점수는 수정 완료");
		} else {
			this.score = newScore;
			System.out.println("잘못된 점수 입력");
		}
	}
}

public class Test1 {
	public static void main(String[] args) {

		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);

//		System.out.println(student);

		student.printStudentInfo();
		System.out.println("--------------------");

		student.updateScore(98.0);
		System.out.println("--------------------");

		student.updateScore(102.0);
		System.out.println("--------------------");

		student.printStudentInfo();
		System.out.println("--------------------");

	}
}
