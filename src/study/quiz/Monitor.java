package study.quiz;

public class Monitor {
	int inch;
	String madeByInfo;
	String model;
	
	Monitor(String madeByInfo, String model, int inch){
		this.madeByInfo=madeByInfo;
		this.model = model;
		this.inch=inch;}
		
		void look() {
		System.out.print("제조사: " + madeByInfo+" ");
		System.out.print("모델명: " + model+" ");
		System.out.print("인치: " + inch+"인치");
		System.out.println();
		
		
	}
	
}
