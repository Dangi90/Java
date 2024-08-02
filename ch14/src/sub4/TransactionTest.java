package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 날짜 : 24/07/30 이름 : 박준우 내용 : Transaction 실습하기
 */
public class TransactionTest {

	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/bank";
	private final static String USER = "root";
	private final static String PASS = "1234";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생 하시겠습니까?");

		int answer = sc.nextInt();
		
		Connection conn = null;
        PreparedStatement psmt1 = null;
        PreparedStatement psmt2 = null;

		try {
			Connection conn1 = DriverManager.getConnection(HOST, USER, PASS);
			// 트랜잭션 시작
			conn1.setAutoCommit(false);

			String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - 10000 WHERE `a_no`=?";
			String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + 10000 WHERE `a_no`=?";

			PreparedStatement psmt11 = conn1.prepareStatement(sql1);
			psmt11.setString(1, "101-11-1001");

			PreparedStatement psmt21 = conn1.prepareStatement(sql2);
			psmt21.setString(1, "101-11-1003");

			psmt11.executeUpdate(); // sql1 실행

			if (answer == 1) {
				throw new Exception("에러가 발생했습니다.");
			}

			psmt21.executeUpdate(); // sql2 실행

			conn1.commit();
			System.out.println("트랜잭션 완료...");

			psmt11.close();
			psmt21.close();
			conn1.close();

		      
        } catch (Exception e) {
            // 에러 발생 시 트랜잭션 롤백
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("트랜잭션 롤백...");
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // 리소스 닫기
            try {
                if (psmt1 != null) psmt1.close();
                if (psmt2 != null) psmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}