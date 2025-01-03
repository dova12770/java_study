package study.api;

public class ArplInfo {

	/*
	 CREATE TABLE ARPLINFO(
    	arplno NUMBER Primary key,
	    informCode VARCHAR2(64),
	    actionknack VARCHAR2(1024),
	    informCause VARCHAR2(1024),
	    informData VARCHAR2(1024),
	    informGrade VARCHAR2(1024),
	    imageUrl1 VARCHAR2(1024)
		);
	 */
	int arplNo; //PK 역할 순번
	
	String informCode;
	String actionKnack;
	String informCause;
	String informData;
	String informGrade;
	String imageUrl1;
	

	public int getArplNo() {
		return arplNo;
	}
	public void setArplNo(int arplNo) {
		this.arplNo = arplNo;
	}
	public String getInformCode() {
		return informCode;
	}
	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}
	public String getActionKnack() {
		return actionKnack;
	}
	public void setActionKnack(String actionKnack) {
		this.actionKnack = actionKnack;
	}
	public String getFinformCaus() {
		return informCause;
	}
	public void setinformCause(String informCause) {
		this.informCause = informCause;
	}
	public String getInformData() {
		return informData;
	}
	public void setInformData(String informData) {
		this.informData = informData;
	}
	public String getInformGrade() {
		return informGrade;
	}
	public void setInformGrade(String informGrade) {
		this.informGrade = informGrade;
	}
	public String getImageUrl1() {
		return imageUrl1;
	}
	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}
	
	@Override
	public String toString() {
		return "ArplInfo [arplNo=" + arplNo + ", informCode=" + informCode + ", actionKnack=" + actionKnack
				+ ", finformCaus=" + informCause + ", informData=" + informData + ", informGrade=" + informGrade
				+ ", imageUrl1=" + imageUrl1 + "]";
	}
	
}
