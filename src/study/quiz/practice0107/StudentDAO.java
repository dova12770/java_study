package study.quiz.practice0107;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.api.DBConnectionManager;

public class StudentDAO {

	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs;
	
public List<StudentDTO> findStudent(){
		
		conn=DBConnectionManager.connectDB();
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		String sqlQuery = "select * from student";
		
		try {
		psmt = conn.prepareStatement(sqlQuery);

		rs = psmt.executeQuery();
		
		while(rs.next()) {
			StudentDTO s1 = new StudentDTO();
			
			s1.setStudno(rs.getInt("Studno"));
			s1.setName(rs.getString("name"));
			s1.setId(rs.getString("id"));
			s1.setGrade(rs.getInt("grade"));
			s1.setJumin(rs.getString("jumin"));
			s1.setBirthday(rs.getDate("birthday").toLocalDate());
			s1.setTel(rs.getString("tel"));
			s1.setHeight(rs.getInt("height"));
			s1.setWeight(rs.getInt("weight"));
			s1.setDeptno1(rs.getInt("deptno1"));
			s1.setDeptno2(rs.getInt("deptno2"));
			s1.setProfno(rs.getInt("profno"));
			
			studentList.add(s1);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
	}
	
	public List<StudentDTO> findStudentListByGrade(int grade){
		
		conn=DBConnectionManager.connectDB();
		
		List<StudentDTO> studentList2 = new ArrayList<StudentDTO>();
		
		String sqlQuery = "select * from student where grade = ? ";
		
		try {
		psmt = conn.prepareStatement(sqlQuery);
		
		
		psmt.setInt(1, grade);
		
		rs = psmt.executeQuery();
		
		while(rs.next()) {
			StudentDTO s2 = new StudentDTO();
			
			s2.setStudno(rs.getInt("Studno"));
			s2.setName(rs.getString("name"));
			s2.setId(rs.getString("id"));
			s2.setGrade(rs.getInt("grade"));
			s2.setJumin(rs.getString("jumin"));
			s2.setBirthday(rs.getDate("birthday").toLocalDate());
			s2.setTel(rs.getString("tel"));
			s2.setHeight(rs.getInt("height"));
			s2.setWeight(rs.getInt("weight"));
			s2.setDeptno1(rs.getInt("deptno1"));
			s2.setDeptno2(rs.getInt("deptno2"));
			s2.setProfno(rs.getInt("profno"));
			
			studentList2.add(s2);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList2;
	}
	
	public  int saveStudent(StudentDTO student) {
		conn=DBConnectionManager.connectDB();
		
		int result =0;
		
		String sqlQuery =" insert into student values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, student.getStudno());
			psmt.setString(2, student.getName());
			psmt.setString(3, student.getId());
			psmt.setInt(4, student.getGrade());
			psmt.setString(5, student.getJumin());
			psmt.setDate(6, java.sql.Date.valueOf(student.getBirthday()));
			psmt.setString(7, student.getTel());
			psmt.setInt(8, student.getHeight());
			psmt.setInt(9, student.getWeight());
			psmt.setInt(10, student.getDeptno1());
			psmt.setInt(11, student.getDeptno2());
			psmt.setInt(12, student.getProfno());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
