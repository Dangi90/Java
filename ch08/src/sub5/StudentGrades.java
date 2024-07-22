package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
	public static void main(String[] args) {
		//Map 선언
		Map<String, ArrayList<Integer>> studentGrades = new HashMap<>();
		
		//학생들의 성적 초기화
		ArrayList<Integer> aliceGrades = new ArrayList<>();
		aliceGrades.add(58);
		aliceGrades.add(77);
		aliceGrades.add(99);
		
		ArrayList<Integer> bobGrades = new ArrayList<>();
		bobGrades.add(100);
		bobGrades.add(66);
		bobGrades.add(88);
		
		//Map에 학생과 그 성적 추가
		studentGrades.put("Alice", aliceGrades);
		studentGrades.put("bob", bobGrades);
		
		//학생들의 성적 출력
		for(Map.Entry<String, ArrayList<Integer>> entry : studentGrades.entrySet()) {
			String student = entry.getKey();
			ArrayList<Integer> grades = entry.getValue();
			System.out.println("Student : "+ student + "\n Grades : "+ grades);
			
		}
		
	}

}
