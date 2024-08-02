package user2;

import java.util.List;
import java.util.Scanner;

public class User2Main {

	public static void main(String[] args) {

		System.out.println("------------------");
		System.out.println("회원 관리 매니저 v2.0");
		System.out.println("------------------");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");

			int answer = sc.nextInt();

			if (answer == 0) {
				break;

			} else if (answer == 1) {
				System.out.println("아이디 입력: ");
				String uid = sc.next();
				System.out.println("이름 입력: ");
				String name= sc.next();
				System.out.println("생일 입력: ");
				String birth = sc.next();
				System.out.println("주소 입력: ");
				String addr = sc.next();
				
				User2VO vo = new User2VO(uid, name, birth, addr);
				User2DAO dao = User2DAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력 완료.");

			} else if (answer == 2) {
				
				User2DAO dao = User2DAO.getInstance(); 
				List<User2VO> users = dao.selectUsers();
				
				for(User2VO user : users) {
					System.out.println(user);
					
				}

			} else if (answer == 3) {
				
				System.out.println("검색할 아이디 입력: ");
				String uid = sc.next();
				User2DAO dao = User2DAO.getInstance();
				User2VO user = dao.selectUser(uid);

			} else if (answer == 4) {
				
				System.out.println("수정할 아이디 입력: ");
				String uid = sc.next();
				
				User2DAO dao = User2DAO.getInstance();
				User2VO user = dao.selectUser(uid);
				
				if(user != null) {
						System.out.println("이름 입력: ");
						user.setName(sc.next());
						System.out.println("생일 입력: ");
						user.setBirth(sc.next());
						System.out.println("주소 입력: ");
						user.setAddr(sc.next());
						
						dao.updateUser(user);
						System.out.println("수정 완료...");
					
				}else {
					System.out.println("해당 아이디가 없습니다.");
				}
				

			} else if (answer == 5) {
				System.out.println("삭제할 아이디 입력: ");
				String uid = sc.next();
				User2DAO dao = User2DAO.getInstance();
				dao.deleteUser(uid);
				System.out.println("삭제 완료.");;

			} // if문 종료

		} // while문 종료

		sc.close();
		System.out.println("프로그램 종료...");
	}

}
