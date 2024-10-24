package study.quiz;

import java.util.Scanner;

public class Practice1023_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		System.out.print("숫자를 입력 :");
		int number = scanner.nextInt();
		if(number % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		System.out.println();
		
		//2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		System.out.print("숫자를 입력 :");
		int number1 = scanner.nextInt();
		if(number1 % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다.");
		}
		System.out.println();
		
		//3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		int sum = 0;
		for(int i=1; i<=1000;i++) {
			if(i % 5 ==0) {
				sum = sum+i;
			}
		}System.out.println(sum);
		System.out.println();
		
		//4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기
		System.out.print("숫자를 입력 :");
		int number2 = scanner.nextInt();
		if(number2>=1 && number2<=50) {
			System.out.print("결과: ");
			for(int i=1; i<=number2;i++) {
				System.out.print("*");
		}
		} else {}
		System.out.println();
		
		//5.1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		
		int oddsum=0;
		int evensum=0;
		for(int i=0; i<10;i++) {
			if(i % 2==0) {
				oddsum=oddsum+i;
			} else if(i % 2 != 0) {
				evensum=evensum+i;
			}	
		}System.out.println(oddsum-evensum);
		System.out.println();
		
		//6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		//1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		int totalsum = 0;
		for(int i=0; totalsum<1000;i++) {
			totalsum = totalsum+i;
		}
		System.out.println("총합 : "+totalsum);
		System.out.println();
		
		//7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		
		System.out.print("숫자를 입력 :");
		int number4 = scanner.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(number4+" * "+ i + " = " + (number4*i));
		}
		

	}

}
