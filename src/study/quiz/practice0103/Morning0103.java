package study.quiz.practice0103;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v1.Dept;

public class Morning0103 {

	public static void main(String[] args) {

		List<Professor> profList = findProfessorListByDepton(101);
		if(profList != null && profList.size()>0) {
			
			for(Professor prof : profList) {
				System.out.println(prof.getProfno()+" "+prof.getName()+ " " + prof.getId()+" "+
						prof.getPosition()+" "+prof.getPay()+" "+prof.deptno);
			}
		}
	}

	public static List<Professor> findProfessorListByDepton(int deptno) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; 
		PreparedStatement psmt = null;
		ResultSet rs = null; 
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Professor> profList =null;
		
		String sqlQuery = "select * from professor where deptno = ? " ;
		try {
			
		psmt = conn.prepareCall(sqlQuery);
		
		psmt.setInt(1, deptno);
		
		rs = psmt.executeQuery();
		
		while (rs.next()) {

			if(profList == null) 
				profList = new ArrayList<Professor>();
			
			Professor prof = new Professor(rs.getInt("profno"),rs.getString("name"), rs.getString("id"),rs.getString("position"),rs.getInt("pay"),rs.getInt("deptno"));
			profList.add(prof);

		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
		
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
		return profList;
	}
}
