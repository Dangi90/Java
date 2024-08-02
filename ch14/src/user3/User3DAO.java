package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user3.User3VO;

public class User3DAO {
	
	 // 싱글톤 인스턴스
    private static User3DAO instance = new User3DAO();

    // 싱글톤 인스턴스를 반환하는 메서드
    public static User3DAO getInstance() {
        return instance;
    }

    // 기본 생성자
    private User3DAO() {
    }

    // 데이터베이스 연결 정보
    private final static String HOST = "jdbc:mysql://localhost:3306/studydb"; // 데이터베이스 URL
    private final static String USER = "root"; // 데이터베이스 사용자명
    private final static String PASS = "1234"; // 데이터베이스 비밀번호

    // 사용자 정보를 데이터베이스에 삽입하는 메서드
    public void insertUser(User3VO vo) {
        // SQL 쿼리문 정의
        String sql = "INSERT INTO `user3` (uid, name, birth, hp, addr) VALUES (?, ?, ?, ?, ?)";

        // 자원을 자동으로 닫기 위한 try-with-resources 구문 사용
        try (Connection conn = DriverManager.getConnection(HOST, USER, PASS); // 데이터베이스 연결
             PreparedStatement psmt = conn.prepareStatement(sql)) { // PreparedStatement 생성

            // PreparedStatement에 파라미터 값 설정
            psmt.setString(1, vo.getUid());
            psmt.setString(2, vo.getName());
            psmt.setString(3, vo.getBirth());
            psmt.setString(4, vo.getHp());
            psmt.setString(5, vo.getAddr());

            // SQL 쿼리 실행
            psmt.executeUpdate();

        } catch (SQLException e) {
            // SQLException 발생 시 스택 트레이스 출력
            e.printStackTrace();
        }
    }
	
	public List<User3VO> selectUsers() {
		String sql = "select * from `user3`";
		List<User3VO> users = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				User3VO vo = new User3VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAddr(rs.getString(5));
				
				users.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}
	
	public void seletUser() {}
	public void updateUser() {}
	public void deleteUser() {}

}
