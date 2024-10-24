package study.practice;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연습문제 - 1
		/*
		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		*/
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("정수 입력하세요 : ");
		int num = scanner.nextInt();
		
		if(num%2 ==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		switch(num%2) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
		
		System.out.println(num%2 ==0 ? "even" : "odd");
		
		/*
		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		*/
		
		System.out.println("정수를 입력 : ");
		int num1 = scanner.nextInt();
		if(num1 % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다.");
		}
		System.out.println();
		
		/*
		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		*/
		
		int sum = 0;
		for(int i=1; i<=1000;i++) {
			if(i % 5 ==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
		sum=0;
		for(int i=1; i<=1000;i=i+5) {
			if(i % 5 ==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
		/*
		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		ex) 입력 : 10
		결과 : **********
		*/
		
		System.out.println("1~50 정수를 입력하세요 : ");
		int num2 = scanner.nextInt();
		
		
		for(int i=1; i<num2;i++) {
			System.out.print("*");
		}
		
		/*
		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		ex) 1 - 2 + 3 - 4 .....
		*/
		
		int result = 0;
		for(int i=1; i<=10; i++) {
			
			if(i%2 == 0) {
				result =result -1;
			} else {
				result = result + 1;
			}
		}
		System.out.println(result);
		
		result = 0;
		for(int i=1; i<=10; i=i+2){
			result = result +i;
		}
		for(int i=2; i<=10; i=i+2){
			result = result -i;
		}
		System.out.println(result);
		/*
		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		 */
		
		int total = 0;
		/*for(int i=1; total<=1000; i++) {
			total=total+i;
		}*/
		/*
		int i=1;
		while(total<1000) {
			total =total + i;	//1 + 2 + 3
			i++;//4
		}
		System.out.println("누적 값 : " + total);
		
		total =0;
		int i=1;
		while(true) {
			total =total + i;	
			i++;//4
			if(total >= 1000)
				break;
		}
		System.out.println("누적 값 : " + total);
		*/
		
		/*
		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
		 */
		
		System.out.print("몇단 출력할개? (1~9) : ");
		int alpha = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d * %2d = %3d\n",alpha, i, alpha*i);
			//System.out.println(alpha+"*"+i+"="+(alpha*i));
		}
		
	}

}
