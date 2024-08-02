package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 날짜 : 24/07/29 이름 : 박준우 내용 : JDBC 접속 프로그램 테스트
 */

public class InsertTest {
	public static void main(String[] args) throws SQLException {
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";

		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - 데이터베이스 접속
			Statement stmt = conn.createStatement();

			// 3단계 - SQL 실행
			String sql = "INSERT INTO `user2` values (?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "J101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "1999-02-23");
			psmt.setString(4, "부산광역시");
			
//			String sql = "Update `user1` set";
//			sql += "`hp` = '010-1234-1111',";
//			sql += "`age` = 33";
//			sql += "where `uid` = 'j101'";
			
//			String sql = "Delete FROM `user1` where `uid` = 'j101'";

			//4단계
			psmt.executeUpdate();
			
			//5단계
			psmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB수정 완료...");

	}
}
