package study.inter.inter02;

public class Person {
	
	//Phone p;
	//GalaxyPhone gp;
	//IPhone ip;
	
	Callable callPhone;	//new GalaxyPhone()	new IPhone()
	
	public void call(String phoneNumber) {
		//phoneNUmber 쪽 전화번호로 전화를 걸자
		callPhone.call();
	}
}
