package study.practice;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 for/while 반복
		 */
		System.out.println("=======================");
		for(int i=1; i<=5; i++){
			System.out.println("12345");
		}
		
		System.out.println("=======================");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				//실행문
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		for(int i=1; i<=5; i++) {
			System.out.println(11111*i);
		}
		
		System.out.println("=======================");
		for(int i=11111; i<=55555; i=i+11111) {
			System.out.println(i);
		}
		System.out.println("=======================");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
