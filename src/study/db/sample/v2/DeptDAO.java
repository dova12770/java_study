package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Data Access Object
public class DeptDAO {
	
	Connection conn; 
	PreparedStatement psmt;
	ResultSet rs;
	
	
	//public int modifyDept(int deptno,String dname, String loc) {
	public int modifyDept(Dept dept) {
		//			modifyDept("재무팀","부산")
		conn = DBConnectionManager.connectDB();

		int result =0;
		// 쿼리 준비
		String sqlQuery = " update dept "
						+ "set dname =?,loc=? "
						+ "where deptno =?";
		try {
			// 쿼리 실행후 데이터 후속 처리

			psmt = conn.prepareCall(sqlQuery);

			// 파라미터 셋팅
			psmt.setString(1, dept.getDname());
			psmt.setString(2, dept.getLoc());
			psmt.setInt(3, dept.getDeptno());

			//select -> executeQuery
			//insert, update, delete -> executeUpdate
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;

	}
	
	//insert update delete	-> 실행수 적용된 행의 갯수
//	public int saveDept(int deptno, String dname, String loc) {
	public int saveDept(Dept dept) {
		
		conn = DBConnectionManager.connectDB();

		int result =0;
		// 쿼리 준비
		String sqlQuery =" insert into dept(deptno, dname, loc) values(?, ?, ?)";
		try {
			// 쿼리 실행후 데이터 후속 처리

			psmt = conn.prepareCall(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());

			//select -> executeQuery
			//insert, update, delete -> executeUpdate
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;

	}
	
	public int removeDept(int deptno) {
		
		conn = DBConnectionManager.connectDB();

		int result =0;
		// 쿼리 준비
		String sqlQuery =" delete from dept where deptno =? ";
		try {
			// 쿼리 실행후 데이터 후속 처리

			psmt = conn.prepareCall(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, deptno);

			//select -> executeQuery
			//insert, update, delete -> executeUpdate
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
	public int removeDept(Dept dept) {
		int deptno =dept.getDeptno();

		return removeDept(deptno);
		
	}
	
	public Dept findDeptByDeftno(int deptno) {

		conn = DBConnectionManager.connectDB();

		Dept dept = null; 
		
		// 쿼리 준비
		String sqlQuery = "select * from dept where deptno = ? ";
		try {
			// 쿼리 실행후 데이터 후속 처리

			psmt = conn.prepareCall(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

//			Dept dept = new Dept();

			if (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.
//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("loc"));
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return dept;

	}

	public List<Dept> findDeptList() {

		conn = DBConnectionManager.connectDB();

		List<Dept> deptList = null;

		// 쿼리 준비

		String sqlQuery = "select * from dept";
		try {
			// 쿼리 실행후 데이터 후속 처리
			psmt = conn.prepareCall(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다.

				if (deptList == null)
					deptList = new ArrayList<Dept>();

				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);

//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return deptList;
	}

}
