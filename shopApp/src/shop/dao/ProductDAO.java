package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.ProductVO;


public class ProductDAO extends DBHelper {
	
	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	// 기본 CRUD 메서드
	public int insertProduct(ProductVO vo) {
		
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setInt(1, vo.getProdNo());
			psmt.setString(2, vo.getProdName());
			psmt.setInt(3, vo.getStock());
			psmt.setInt(4, vo.getPrice());			
			psmt.setString(4, vo.getCompany());			
			count = psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public List<ProductVO> selectProducts() {List<ProductVO> products = new ArrayList<>();

	try {
	
        conn = getConnection(); // 연결 초기화
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(SQL.SELECT_PRODUCT);
		
		while(rs.next()) {
			ProductVO vo = new ProductVO();
			vo.setProdNo(rs.getInt(1));
			vo.setProdName(rs.getString(2));
			vo.setStock(rs.getInt(3));
			vo.setPrice(rs.getInt(4));
			vo.setCompany(rs.getString(5));
			
			products.add(vo);
		
		}
		
		closeAll(); // DBHelper의 closeAll 메서드 호출
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return products;
	}
	
	public int updateProduct(ProductVO vo) {
		return 0;
	}
	
	public int deleteProduct(String custId) {
		return 0;
	}
	
}