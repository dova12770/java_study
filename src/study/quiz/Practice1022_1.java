package study.quiz;

import java.util.Scanner;

public class Practice1022_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90
		 */
		Scanner scanner = new Scanner(System.in);
		/*
		int[] num1 = new int[5];
		System.out.println("정수 5개를 입력");
		for(int i=0; i<num1.length; i++) {
			num1[i] =scanner.nextInt();
		}
		System.out.println("몇번째 수인가요?");
		int alpha=scanner.nextInt();
		System.out.println(num1[alpha-1]);
		*/
		/*
		2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1
		*/
/*
		int[] num2 = new int[5];
		System.out.println("정수 5개를 입력");
		for(int i=0; i<num2.length; i++) {
			num2[i] =scanner.nextInt();
		}
		System.out.println("역정렬");
		for(int i=4; i>=0; i--) {
			System.out.print(num2[i]+" ");
		}
			*/
		
		
		/*
		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16
		*/
		int[][] num3 = new int[4][4];
		int gamma = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				num3[i][j] = gamma;
				gamma = gamma +1;
			}
		}
	}

}
