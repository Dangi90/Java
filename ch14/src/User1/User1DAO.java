package User1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class User1DAO {

	// 싱글톤
	private static User1DAO instance = new User1DAO();

	public static User1DAO getInstance() {
		return instance;
	}

	private User1DAO() {}

	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";

	// CRUD 메서드
	public void insertUser(User1VO vo) {
		String sql = "INSERT INTO `user1` (uid, name, hp, age) VALUES (?, ?, ?, ?)";

		try (
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			 PreparedStatement psmt = conn.prepareStatement(sql)) {
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());

			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User1VO selectUser(String uid) {
		String sql = "SELECT * FROM `user1` WHERE `uid` = ?";
		User1VO user = null;

		try (
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			 PreparedStatement psmt = conn.prepareStatement(sql)) {
			psmt.setString(1, uid);
			try (
					ResultSet rs = psmt.executeQuery()) {
				if (rs.next()) {
					user = new User1VO();
					user.setUid(rs.getString("uid"));
					user.setName(rs.getString("name"));
					user.setHp(rs.getString("hp"));
					user.setAge(rs.getInt("age"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	public List<User1VO> selectUsers() {
		String sql = "SELECT * FROM `user1`";
		List<User1VO> users = new ArrayList<>();

		try (
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			 PreparedStatement psmt = conn.prepareStatement(sql);
			 ResultSet rs = psmt.executeQuery()) {
			if (rs.next()) {
				User1VO user = new User1VO();
				user.setUid(rs.getString("uid"));
				user.setName(rs.getString("name"));
				user.setHp(rs.getString("hp"));
				user.setAge(rs.getInt("age"));
				users.add(user);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}

	public void updateUser(User1VO vo) {
		String sql = "UPDATE `user1` SET `name`=?, `hp`=?, `age`=? WHERE `uid`=?";
		int result = 0;
		try (
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			 PreparedStatement psmt = conn.prepareStatement(sql)) {
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());

			// sql이 적용되는 row 카운터 반환
			// result = psmt.executeUpdate();
			psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser(String uid) {
		String sql = "DELETE FROM `user1` WHERE `uid`=?";

		try (
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			 PreparedStatement psmt = conn.prepareStatement(sql)) {
			psmt.setString(1, uid);
			psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
