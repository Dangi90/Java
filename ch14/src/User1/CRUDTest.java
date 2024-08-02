package User1;

import java.util.List;
import java.util.Scanner;

public class CRUDTest {

	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("------------------------");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");

			int answer = sc.nextInt();

			if (answer == 0) {
				break;
			} else if (answer == 1) {
				System.out.print("아이디 입력: ");
				String uid = sc.next();
				System.out.print("이름 입력: ");
				String name = sc.next();
				System.out.print("휴대폰 입력: ");
				String hp = sc.next();
				System.out.print("나이 입력: ");
				int age = sc.nextInt();

				User1VO vo = new User1VO(uid, name, hp, age);
				User1DAO dao = User1DAO.getInstance();
				dao.insertUser(vo);

				System.out.println("입력 완료...");
			} else if (answer == 2) {
				User1DAO dao = User1DAO.getInstance();
				List<User1VO> users = dao.selectUsers();

				for (User1VO user : users) {
					System.out.println(user);
				}
			} else if (answer == 3) {
				System.out.print("검색할 아이디 입력: ");
				String uid = sc.next();
				User1DAO dao = User1DAO.getInstance();
				User1VO user = dao.selectUser(uid);

				if (user != null) {
					System.out.println(user);
				} else {
					System.out.println("해당 아이디의 회원이 없습니다.");
				}
			} else if (answer == 4) {
				System.out.print("수정할 아이디 입력: ");
				String uid = sc.next();
				User1DAO dao = User1DAO.getInstance();
				User1VO user = dao.selectUser(uid);

				if (user != null) {
					System.out.print("이름 입력: ");
					user.setName(sc.next());
					System.out.print("휴대폰 입력: ");
					user.setHp(sc.next());
					System.out.print("나이 입력: ");
					user.setAge(sc.nextInt());

					dao.updateUser(user);
					System.out.println("수정 완료...");
				} else {
					System.out.println("해당 아이디의 회원이 없습니다.");
				}
			} else if (answer == 5) {
				System.out.print("삭제할 아이디 입력: ");
				String uid = sc.next();
				User1DAO dao = User1DAO.getInstance();
				dao.deleteUser(uid);
				System.out.println("삭제 완료...");
			}
		}

		sc.close();
		System.out.println("프로그램 종료...");
	}
}
