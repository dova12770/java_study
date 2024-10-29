package study.practice.Practice18;

public class TV {
	
	String company;
	int year;
	int inch;
	
	TV(String company, int year,int inch){
		this.company=company;
		this.year=year;
		this.inch=inch;
	}
	
	void show() {
		System.out.println(company+"제품 "+year+"년형 "+inch+"인치 TV");
	}
}
