package study.practice.practice24;

public class GasRange {

	int fireCount;
	String brand;
	int price;
	
	int fireLevel;
	
	public void fireOn() {
		fireLevel = 1;
	}
	
	public void fireOff() {
		fireLevel = 0 ;
	}
	
	public void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
}
