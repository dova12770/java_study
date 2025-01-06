package quiz.dbTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import quiz.dbTest.TestInfo;
import quiz.dbTest.DBConnectionManager;

public class TestDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public int saveArplInfo(TestInfo testInfo) {

		conn = DBConnectionManager.connectDB();

		int result = 0;

		String sqlQuery = " insert into TESTINFO values ( testInfo_pk_seq.nextval, ?, ?, ?, ?, ?, ?)";
		try {

			psmt = conn.prepareCall(sqlQuery);

			psmt.setString(1, testInfo.getNumOfRows());
			psmt.setString(2, testInfo.getDataType());
			psmt.setString(3, testInfo.getBaseDate());
			psmt.setString(4, testInfo.getBaseTime());
			psmt.setString(5, testInfo.getNx());
			psmt.setString(6, testInfo.getNy());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;

	}
}
