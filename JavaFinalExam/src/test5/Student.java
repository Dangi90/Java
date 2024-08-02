package test5;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;

	public Student(String name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void enrollSubject(Subject subject) {
		subjects[subjectCount] = subject; // 과목 등록
		subject.addStudent(this); // 과목에 학생 등록
		scores[subjectCount++] = 0; // 과목 수 증가

		System.out.println(this.name + " - " + subject.getsubName() + "과목 신청완료.");
	}

	public void setScore(Subject subject, int score) {

		for (int i = 0; i < subjectCount++; i++) {
			if (subjects[i].equals(subject)) {
				scores[i] = score;
				System.out.println(name + "-" + subject.getsubName() + "점수 입력완료");
				return;
			}
		}
	}

	public void printStudentInfo() {
		System.out.println("학생명: " + name);
		System.out.println("아이디: " + studentId);
		System.out.println("성적: ");
		for (int i = 0; i < subjectCount; i++) {
			if (subjects[i] != null) {
			System.out.println("-" + subjects[i].getsubName() + ": " + scores[i]);
			}
		}
	}

}
