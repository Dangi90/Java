package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sub3.User2VO;

/**
 * 날짜 : 24/07/29 이름 : 박준우 내용 : JDBC 접속 프로그램 테스트
 */

public class SelectTest {
	public static void main(String[] args) {
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";

		List<User2VO> user2s = new ArrayList<>();

		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로드 추가
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 2단계 - 데이터베이스 접속
			String sql = "SELECT * FROM `user2`";
			PreparedStatement psmt = conn.prepareStatement(sql);

			// 3단계
			ResultSet rs = psmt.executeQuery();

			// 4단계
			while (rs.next()) {

				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));

				user2s.add(vo);

			}

			// 5단계
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("무슨오류?");
		}
		for (User2VO vo : user2s) {
			System.out.println(vo);
		}

		System.out.println("시스템 종료....");
	}
}
