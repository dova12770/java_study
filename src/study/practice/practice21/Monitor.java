package study.practice.practice21;

public class Monitor {
	
	String company;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	Monitor(String company,int inch,int price){
		this.company= company;
		this.inch =inch;
		this.price =price;
	}
	
	public void setColor(String color) {
		this.color =color;
	}
	public void setXY(int x,int y) {
		this.maxResolutionX = x;
		this.maxResolutionY = y;
	}
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	public int addPrice(int TempPrice) {
		this.price=this.price+TempPrice;
		
		return this.price;
	}
	public void printInfo() {
		System.out.printf("제조사:%s %d인치 모니터 가격:%d원 색상:%s 해상도: %d * %d \n",
							company,inch,price,color, maxResolutionX,maxResolutionY);
	}

}
