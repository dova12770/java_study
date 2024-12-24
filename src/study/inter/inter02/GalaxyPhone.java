package study.inter.inter02;

//갤럭시
public class GalaxyPhone implements Callable, Connectable {
	int callstatus; 	//전화 상태 변수
	@Override
	public void call() {		
		System.out.println("갤럭시 전화 검");
		callstatus = Callable.CALL_ON;
	}
	@Override
	public void connect() {
		System.out.println("갤럭시 블루투스 연결");
	}

}
