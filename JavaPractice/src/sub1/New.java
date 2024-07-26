package sub1;

public class New {
	public static void main(String[] args) {

		int[] grade = new int[] { 85, 65, 90 }; // 길이가 3인 int형 배열을 선언과 동시에 초기화

		int sum = 0;

		for (int str  : grade) {

			System.out.println(str);
			//sum += grade[i];

		}

		System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");

		System.out.println("이 학생의 평균은 " + (sum / grade.length) + "입니다.");
	}
}
