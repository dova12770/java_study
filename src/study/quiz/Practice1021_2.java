package study.quiz;

import java.util.Scanner;

public class Practice1021_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도 : ");
		int year=scanner.nextInt();
		if((year%4 == 0 && year % 100 !=0)|| year%400 ==0) {
			System.out.println("윤년이다.");
		} else {
			System.out.println("윤년이 아니다.");
		}
		/*
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345
		 */
		
		for(int i=1; i<=5; i++) {
			System.out.println("12345");
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
		}
		System.out.println();
		
		/*
		//2.
		11111
		22222
		33333
		44444
		55555
		 */
		for (int i=11111; i<=55555; i=i+11111) {
			System.out.println(i);
		}
		for(int i=11111; i<=55555; i=i+11111) {
			int j =1;
			while(j<=1) {
				System.out.println(i);
				j++;
			}
		}


	}

}
