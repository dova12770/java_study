package study.db.sample.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {

//		selectDept();

//		findProduct();
		
//		selectDept2();
		
//		findDeptByDeftno(40);
//		findDeptByDeftno(20);
		
//		findDept("SALES");
		
//		Dept d1 = findDeptByDeftno(30);
//		if(d1 != null) {
//			System.out.println(d1.getDeptno()+" "+d1.getDname()+ " " + d1.getLoc());
//		}
		
		List<Dept> dList = findDeptList();
		
		if(dList.size()==0) {//팀프로젝트 시작 때 합의하고 해야 할 부분
			
		}
		
		if(dList != null && dList.size()>0) {	//Data 있다
			
			for(Dept d : dList) {
				System.out.println(d.getDeptno()+" "+d.getDname()+ " " + d.getLoc());
			}
		}
		
	}

	public static void findProduct() {
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

		// 쿼리 준비

		String sqlQuery = "select * from product";
		try {
			// 쿼리 실행후 데이터 후속 처리

			psmt = conn.prepareCall(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.

				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
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
	}

	// readDept findDept findDeptList
	public static void selectDept() {
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

		// 쿼리 준비

		String sqlQuery = "select * from dept";
		try {
			// 쿼리 실행후 데이터 후속 처리
			psmt = conn.prepareCall(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.
//				System.out.println(rs.getInt(1)); //인덱스는 순서가 달라지면 오류가 날 수 있다.
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));

				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
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
	}



	public static Dept findDeptByDeftno(int deptno) {
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
		Dept dept = null; //finally쓰지않을때
		// 쿼리 준비

		String sqlQuery = "select * from dept where deptno = ? " ;
		try {
			// 쿼리 실행후 데이터 후속 처리
			
			psmt = conn.prepareCall(sqlQuery);
			
			//파라미터 셋팅
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
//			Dept dept = new Dept();

			if (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.
//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("loc"));
				dept=new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));		
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		// DB 연결 종료
		try {
			if (rs != null) {
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
		return dept;

	}
	
	public static void selectDept2() {
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

		// 쿼리 준비

		String sqlQuery = "select * from dept where deptno = 30";
		try {
			// 쿼리 실행후 데이터 후속 처리
			psmt = conn.prepareCall(sqlQuery);
			rs = psmt.executeQuery();

			if (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
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
	}
	
	public static void findDept(String dname) {
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

		// 쿼리 준비

		String sqlQuery = "select * from dept where dname = ? " ;
		try {
			// 쿼리 실행후 데이터 후속 처리
			
			psmt = conn.prepareCall(sqlQuery);
			
			//파라미터 셋팅
			psmt.setString(1, dname);
			
			rs = psmt.executeQuery();

			if (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
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
	}
	
	public static List<Dept> findDeptList() {
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
		
		List<Dept> deptList =null;

		// 쿼리 준비

		String sqlQuery = "select * from dept";
		try {
			// 쿼리 실행후 데이터 후속 처리
			psmt = conn.prepareCall(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.
				
				if(deptList == null) 
					deptList = new ArrayList<Dept>();
				
				Dept dept = new Dept(rs.getInt("deptno"),rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);
				
//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
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
		return deptList;
	}
}