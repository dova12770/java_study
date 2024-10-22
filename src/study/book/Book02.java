package study.book;

import java.util.Scanner;

public class Book02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println( x +"," + y);
				}
			}
		}

		
		for(int a=0;a<5; a++) {
			for (int b=0; b< a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner scanner= new Scanner(System.in);
		boolean run= true;
		int money = 0;
		
		while(run) {
			System.out.println("================================");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("================================");
		}
		String money1 = scanner.nextLine();
		
		if(money1.equals("1")) {
			
		}
		
		
		
	}

}
