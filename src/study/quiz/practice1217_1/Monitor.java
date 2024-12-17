package study.quiz.practice1217_1;

public class Monitor {
	
	String maker;
	int inch;
	int price;
	String color;
	int x;
	int y;
	
	public void option(String maker,int inch,int price) {
		this.maker=maker;
		this.inch=inch;
		this.price=price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	public int pricePlus(int index){
		this.price = this.price+index;
		return this.price;
	}
	public void monitorInfo() {
		System.out.println("제조회사 : "+maker);
		System.out.println("인치 : " + inch);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
		System.out.println("해상도 : " + x + "*"+ y);
		System.out.println();
	}
}
