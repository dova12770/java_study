package study.quiz.practice0102;

public class Morning {

	public static void main(String[] args) {

		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();

//		mt1.start();
//		mt2.start();

		EvenRunnable er = new EvenRunnable();
		Thread t1 = new Thread(er);
		Thread t2 = new Thread(new OddRunnable());

//		t1.start();
//		t2.start();

		NumberThread nt1 = new NumberThread(true);
		NumberThread nt2 = new NumberThread(false);

		nt1.start();
		nt2.start();
	}

}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class EvenRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class OddRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class NumberThread extends Thread {
	boolean isOdd;
	int remain;
	
	public NumberThread(boolean isOdd) {
		this.isOdd = isOdd;
		if(isOdd) {
			 remain=1;
		} else {
			 remain=0;
		}
	}

	public void run() {
		for (int i = 1; i <= 100; i++) {
//			if (isOdd) {
//				if (i % 2 == 1) {
//					System.out.println(i);
//				} else {
//					if (i % 2 == 0) {
//						System.out.println(i);
//					}
//				}
//			}
		}
	}
}