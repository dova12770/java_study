package study.quiz.practice1217_1;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1= new Monitor();
		Monitor m2= new Monitor();
		
		m1.maker ="삼성";
		m1.inch = 27;
		m1.price= 150000;
		m1.color="검은색";
		
		m2.maker ="LG";
		m2.inch = 32;
		m2.price= 330000;
		
		m1.setX(1080);
		m1.setY(780);
		
		m2.setColor("흰색");
		m2.setX(4096);
		m2.setY(2048);
		
		m1.powerOn();
		m2.powerOn();
		
		m1.monitorInfo();
		m2.monitorInfo();
		
		m2.pricePlus(70000);
		
		m1.monitorInfo();
		m2.monitorInfo();
	}

}
