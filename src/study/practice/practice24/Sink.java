package study.practice.practice24;

public class Sink {

	int width;
	int height;
	int depth;
	String color;
	String material;
	
	public int getWidth() {	//mm
		return width;
	}
	
	public int getWidthAsCm() {	//meter,cm
		return width/10;	//450 mm -> 45cm
	}
}
