package study.practice.Practice23;

public class Computer {
	
	//정적 static
	//상수 final -> static final
	//public static final String[] osType = {"윈도우10", "애플 OS X","안드로이드"};
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X","안드로이드"};
	int index;
//	String os;
	int memory;
	
	public Computer(int index,int memory) {
		this.index=index;
//		this.os =OS_TYPE[index];
		this.memory=memory;
	}
	public void print() {
//		System.out.println("운영체제:"+ os +"메인메모리:"+ memory+"G");
		System.out.println("운영체제:"+ Computer.OS_TYPE[index] +"메인메모리:"+ memory+"G");
	}
	
}
