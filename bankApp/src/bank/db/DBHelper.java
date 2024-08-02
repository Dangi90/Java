package bank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	
	//DB 정보
	private final String HOST = "jdbc:mysql://localhost:3306/bank";
	private final String USER = "root";
	private final String PASS = "1234";
	
	//DB자원
	public Connection 	conn = null;
	public Statement 	stmt = null;
	public PreparedStatement psmt = null;
	public ResultSet 	rs	 = null;
	
	//접속 커넥션
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(HOST,USER,PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeAll() throws SQLException	{
		if(rs != null) {
			rs.close();
		}
		if(psmt != null) {
			psmt.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(conn!= null) {
			conn.close();
		}
	}
	
}
