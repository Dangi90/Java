package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *  날짜 : 24/07/29
 *	이름 : 박준우
 *	내용 : JDBC 접속 프로그램 테스트  
 */
public class DBConnectionTest {
	public static void main(String[] args) {
	
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection(host,user,pass);
	
			//2단계 - 데이터베이스 접속
			Statement stmt = conn.createStatement();
			
			//3단계 - SQL 실행
			String sql = "INSERT INTO `user1` values ('j101', '김유신', '010-1234-5678', 23)";
			
			//4단계
			stmt.executeUpdate(sql);
			
			//5단계
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
