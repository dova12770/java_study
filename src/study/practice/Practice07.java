package study.practice;

import java.util.Scanner;

public class Practice07 {

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
		/*
		Scanner scanner = new Scanner(System.in);
		
		int[] numArr = new int[5];
		
		System.out.print("5개 정수를 입력하세요 :");
		
		for(int i=0; i<numArr.length; i++) {
			//i: 0 1 2 3 4
			numArr[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? :");
		int index = scanner.nextInt();
		System.out.println("결과 :" + numArr[index-1]);
		
		// 인덱스	: 0 1 2 3 4
		// 순번	: 1 2 3 4 5
		*/
		/* 
		numArr[0] = scanner.nextInt();
		numArr[1] = scanner.nextInt();
		numArr[2] = scanner.nextInt();
		numArr[3] = scanner.nextInt();
		numArr[4] = scanner.nextInt();
		*/
		/*
			2.
			+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
			받은후에 순서를 거꾸로 출력하세요.
			ex) 1 2 3 4 5
			결과 : 5 4 3 2 1
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int[] numArr = new int[5];
		
		
		System.out.print("5개 정수를 입력하세요 :");
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
		
		System.out.println("결과 :");
		for(int i=4; i>=0; i--) {
			System.out.print(numArr[i] + " ");
		}
		
		System.out.print("5개 정수를 입력하세요 :");
		
		for(int i=4; i>=0; i--) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println("결과 :");
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}*/
		
		
		/*
			3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
			(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
			1   2   3   4
			5   6   7   8
			9  10 11 12
			13 14 15 16
		*/
		//int[][] nArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] nArr = new int [4][4];
		int num = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nArr[i][j] = num;
				num = num +1;
			}
		}
		
		// i: 0 1 2 3
		// j: 0 1 2 3
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4; j++) {
				//System.out.print(nArr[i][j] + " ");
				System.out.printf("%3d",nArr[i][j]);
			}
			System.out.println();
		}
		
	}

}
