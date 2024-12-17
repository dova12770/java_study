package study.cls.cls05.pack1;

public class Point {

	int math;		//점수관리
	int eng;		// 점수의 범위 0 ~ 99
	private int com;		// 
	
	// getXXX
	// setXXX
	
	public void setMath(int math) { //기본 퍼블릭 getter,setter 라는 형식으로 만들지는 않음
		this.math =math;
	}
	public int getMath() {
		return math; 
	}
	
	public void setCom(int com) {
		if(com > 100) {
			this.com = 100;
		} else if (com < 0) {
			this.com =0;
		}else {
			this.com =com;
		}
		
	}
	
	public int getCom() {
		return this.com;
	}
	
	public Point getPoint() {
		return new Point();
	}
}
