package study.cls.cls04;

public class IPad {

	static String madeBy ="Apple"; //정적 멤버 변수
	String owner;	//인스턴스 멤버 변수
	
	public void powerOn() {
		System.out.println("전원 켜기");
	}
	
	static void check() {
		System.out.println("아이패드입니다.");
	}
}
