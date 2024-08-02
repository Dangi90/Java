package user3;

import java.util.List;
import java.util.Scanner;

import user3.User3DAO;
import user3.User3VO;

public class User3Main {
	
	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("회원 관리 매니저 v3.0");
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer =  sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if (answer == 1) {
				System.out.println("아이디 입력: ");
				String uid = sc.next();
				System.out.println("이름 입력: ");
				String name = sc.next();
				System.out.println("생일 입력: ");
				String birth = sc.next();
				System.out.println("휴대폰 입력: ");
				String hp = sc.next();
				System.out.println("주소 입력: ");
				String addr = sc.next();
				
				User3VO vo = new User3VO(uid, name, birth, hp, addr);
				User3DAO dao = User3DAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력 완료...");

				
			}else if (answer == 2) {
				
				User3DAO dao = User3DAO.getInstance(); 
				List<User3VO> users = dao.selectUsers();
				
				for(User3VO user : users) {
					System.out.println(user);
					
				}
				
			}else if (answer == 3) {
				
				
			}else if (answer == 4) {
				
				
			}else if (answer == 5) {
				
				
			}//if문 종료
			
			
		}//while문 종료

		sc.close();
		System.out.println("프로그램 종료...");
	}

}
