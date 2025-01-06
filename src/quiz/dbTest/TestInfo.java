package quiz.dbTest;

public class TestInfo {
	/*
	 CREATE TABLE TESTINFO(
    	pageNO NUMBER Primary key,
	    numOfRows VARCHAR2(64),
	    dataType VARCHAR2(1024),
	    baseDate VARCHAR2(1024),
	    baseTime VARCHAR2(1024),
	    nx VARCHAR2(1024),
	    ny VARCHAR2(1024)
		);
		
		CREATE SEQUENCE testInfo_pk_seq
		start with 1
		increment by 1
		nocycle;
	 */
	
	int pageNO;
	
	String numOfRows;
	String dataType;
	String baseDate;
	String baseTime;
	String nx;
	String ny;
	
	public int getPageNO() {
		return pageNO;
	}
	public void setPageNO(int pageNO) {
		this.pageNO = pageNO;
	}
	public String getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(String numOfRows) {
		this.numOfRows = numOfRows;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}
	public String getBaseTime() {
		return baseTime;
	}
	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}
	public String getNx() {
		return nx;
	}
	public void setNx(String nx) {
		this.nx = nx;
	}
	public String getNy() {
		return ny;
	}
	public void setNy(String ny) {
		this.ny = ny;
	}
	
	@Override
	public String toString() {
		return "TestInfo [pageNO=" + pageNO + ", numOfRows=" + numOfRows + ", dataType=" + dataType + ", baseDate="
				+ baseDate + ", baseTime=" + baseTime + ", nx=" + nx + ", ny=" + ny + "]";
	}
	
	
	
}
