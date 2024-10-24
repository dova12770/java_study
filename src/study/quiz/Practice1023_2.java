package study.quiz;

import java.util.Scanner;

public class Practice1023_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//1.2x + 4y = 10 이 만족하는
		//	모든 x, y 쌍을 구하시오.
		//	(x와 y는 자연수 1~10)
			
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((2*x)+(4*y)==10) {
					System.out.println("("+ x + "," + y + ")");
				}
			}
		}
		System.out.println();
		
		//2. 정수 2개를 입력 받아서,
		//	 아래 계산 결과를 출력하시오.
		//	 큰수 - 작은수
		
		System.out.print("정수를 입력하세요. : ");
		int alpha = scanner.nextInt();
		System.out.print("정수를 입력하세요. : ");
		int beta = scanner.nextInt();
		if(alpha>beta || alpha==beta) {
			System.out.println("결과 : " + (alpha-beta));
		} else if(alpha<beta) {
			System.out.println("결과 : " + (beta-alpha));
		} else {}
		System.out.println();
		
		/*
		3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		*/
		int[] game = new int[4];
		System.out.print("윷을 던지세요 : ");
		for(int i=0; i<game.length; i++) {
			game[i]=scanner.nextInt();
		}
		int sum = 0;
		for(int i=0; i<4; i++) {
			sum = sum+game[i];
			}
		
		if(sum >=0 && sum<=4) {
			if(sum ==0) {
			System.out.println("결과 :모");
			}	else if(sum ==1) {
			System.out.println("결과 :도");
			}	else if(sum ==2) {
			System.out.println("결과 :개");
			}	else if(sum ==3) {
			System.out.println("결과 :걸");
			}	else if(sum ==4) {
			System.out.println("결과 :윷");
			} else {}
			}
		System.out.println();
		
		//4. 입력받은 수 만큼 별 출력하기
		System.out.print("숫자 입력 : ");
		int star = scanner.nextInt();
		for(int i=0;i<star;i++) {
			System.out.print("*");
		}
	}

}
