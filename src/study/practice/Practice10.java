package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.2x + 4y = 10 이 만족하는
		//	모든 x, y 쌍을 구하시오.
		//	(x와 y는 자연수 1~10)
		/*
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(2*x +4*y ==10) {
					System.out.printf("(x: %d,y: %d)\n", x,y);
				}
			}
		}
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(2*x +4*y> 10) {
					break;
				}
				if(2*x +4*y ==10) {
				System.out.printf("(x: %d,y: %d)\n", x,y);
				}
				
			
			}
		}
		*/
		
		//2. 정수 2개를 입력 받아서,
		//	 아래 계산 결과를 출력하시오.
		//	 큰수 - 작은수
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 2개 입력 : ");
		int num1 =scanner.nextInt();		
		int num2 =scanner.nextInt();	
		
		if(num1> num2) {
			System.out.printf("%d - %d = %d\n", num1,num2,num1-num2);
		} else {
			System.out.printf("%d - %d = %d\n", num2,num1,num2-num1);
		}
		
		/*
		3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		*/
		
		int[] game = new int[4];
		int count=0;
		System.out.print("윷을 던지세요 : ");
		for(int i=0; i<game.length; i++) {
			game[i]=scanner.nextInt();
			count += game[i];
		}
		/*
		int sum = 0;
		for(int i=0; i<game.length; i++) {
			sum = sum + game[i];
			}*/
		/*
		int y1, y2, y3, y4;
		System.out.print("입력 : ");
		y1=scanner.nextInt();
		y2=scanner.nextInt();
		y3=scanner.nextInt();
		y4=scanner.nextInt();
		
		count = y1+y2+y3+y4;
		*/
		if(count ==0) {
			System.out.println("결과:모");
		} else if(count ==1) {
			System.out.println("결과:도");
		} else if(count ==2) {
			System.out.println("결과:개");
		} else if(count ==3) {
			System.out.println("결과:걸");
		} else if(count ==4) {
			System.out.println("결과:윷");
		}
		
		
		//4. 입력받은 수 만큼 별 출력하기
				System.out.print("숫자 입력 : ");
				int num = scanner.nextInt();
				for(int i=0;i<num;i++) {
					System.out.print("*");
				}
	}

}
