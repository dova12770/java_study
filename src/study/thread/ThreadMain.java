package study.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 11; i < 20; i++) {
//			System.out.println(i);
//		}
		
		Thread01 t1 = new Thread01();
		Thread01 t12 = new Thread01();
		Thread01 t13 = new Thread01();	//부모타입 = 자식객체
		
//		t1.run(); //스레드 아님 run 메소드 호출한 것
		t1.start();//쓰레드로 실행 -> run() 사용
		t12.start();
		t13.start();
		
		Thread02 t2 = new Thread02();
		Thread t22 = new Thread(t2);	//new Thread(Runnable task);
		t22.start();
		
		
		
	}

}
