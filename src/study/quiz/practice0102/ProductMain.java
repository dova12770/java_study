package study.quiz.practice0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v1.Dept;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = findProduct(104);
		if(product != null) {
			System.out.printf("%d %s %d\n",product.getP_code(),product.getP_name(),product.getP_price());
		}

		List<Product> pList = findProduct2();

		if (pList.size() == 0) {
		}

		if (pList != null && pList.size() > 0) {
			for (Product p : pList) {
				System.out.println(p.getP_code() + " " + p.getP_name() + " " + p.getP_price());
			}
		}
	}

	public static Product findProduct(int p_code) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; 
		PreparedStatement psmt = null;
		ResultSet rs = null; 
		
		Product product=null;
		
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 쿼리 준비

		String sqlQuery = "select * from product where p_code = ?";
		try {
			
			psmt = conn.prepareCall(sqlQuery);
			
			psmt.setInt(1, p_code);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) { 

				product = new Product();
				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));	
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료

		try {
			if (rs != null) { // 널인지 확인하고 닫아야 오류가 없다.
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	public static List<Product> findProduct2() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		// Statement stmt =null; // sql쪽 임포트 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Product> productList = new ArrayList<Product>();
		// 쿼리 준비

		String sqlQuery = "select * from product";
		try {
			// 쿼리 실행후 데이터 후속 처리

			psmt = conn.prepareCall(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.

				if (productList == null)
					productList = new ArrayList<Product>();

				Product product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료

		try {
			if (rs != null) { // 널인지 확인하고 닫아야 오류가 없다.
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}
}
