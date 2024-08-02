package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class SelectTest {
	
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		//결과처리 리스트 생성
		List<User1VO> user1s = new ArrayList<>();
		
		try {
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from `user1`";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// 조회된 데이터 행 갯수(튜플)만큼 커서를 한 행씩 내려가면서 데이터 조회
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				//리스트 생성
				User1VO vo = new User1VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setHp(hp);
				vo.setAge(age);
				
				user1s.add(vo);
				
				
				//System.out.println(uid + ","+name+","+hp+","+age);
				
			}
			
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DB수정 완료..");
		
		
		
		for(User1VO vo : user1s) {
			System.out.println(vo);
		}
	}

}
