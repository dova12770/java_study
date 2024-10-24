package study.quiz;

import java.util.Scanner;

public class Practice1023_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		//1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.

		for(int i=4;i>=0; i--) {
			for(int j=0; j< i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		//2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.

		for(int i=0;i<4; i++) {
			for(int j=0; j< i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		
		//3. 입력된 수의 약수를 출력하시오.
		System.out.print("입력: ");
		int num = scanner.nextInt();
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//4.중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		
		System.out.print("입력: ");
		int star = scanner.nextInt();
		
		for(int i=0;i<star; i++) {
			for(int j=0; j< i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=star;i>0; i--) {
			for(int j=0; j< i-1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		
		//5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		int sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum= sum+j;
			}
		}System.out.println(sum);
		
		System.out.println();
		
		
		//6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		//100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		int alpha=0;
		int beta=0;
		int gamma=0;
		for(int i=1; beta<100; i++) {
			if(i%2==0) {
				alpha = -1*i;
				beta = beta + alpha;
			} else {
				gamma = i;
				beta = beta + gamma;
			}
		}System.out.println(gamma+"번째, 총합: "+ beta);
		
		int total =0;
		int i;
		for(i=1; total<100; i++) {
			
			if(i%2 ==0) {
				total = total - i;
			} else {
				total = total + i;
			}
		}
		System.out.println("누적합 : " + total + "얼마까지 계산했는가? :" +(i-1));
		
		total =0;
		i=1;
		while(true) {
			if(i%2 ==0) {
				total = total - i;
			} else {
				total = total + i;
			}

			if(total >=100) {
				break;
			}
			i++;
		}
		System.out.println("누적합 : " + total + "얼마까지 계산했는가? :" +i);	
		
	}

}
