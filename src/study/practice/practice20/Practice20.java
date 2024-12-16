package study.practice.practice20;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] lotto = new int[6];
//		
//		//1)
//		int index = 0;
//		boolean isDuplicated = false; 
//		
//		while(true ) {
//			int value = (int)(Math.random()*45)+1;
//			
//			for(int i=0; i<index; i++) {
//				if(lotto[i]== value) {
//					isDuplicated =true;
//					break;
//				}
//			}
//			
////			if(isDuplicated) {
////				
////			} else {
////				lotto[index]= value;
////				index++;
////			}
//			/*
//			if(isDuplicated == false) {
//				lotto[index] = value;
//				index++;
//			}
//			*/
//			if(isDuplicated) {
//				continue;
//			}
//			
//			lotto[index] = value;
//			index++;
//			
//			if(index == 6) {
//				break;
//			}
//		}
//
////		for(int i=0; i<6; i++) {
////			int value = (int)(Math.random()*45)+1;
//////			System.out.println(value);
////			lotto[i]=value;
////		}
////		
////		for(int i=0; i<lotto.length; i++) {
////			
////		}
////		
//		for(int i=0; i<6; i++) {
//			lotto[i] = (int)(Math.random()*45)+1;
//			
//			for(int j=0; j<i; j++) {
//				if(lotto[i]==lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for(int i=0; i<lotto.length; i++) {
//			System.out.print(lotto[i]+" ");
//			}
//		System.out.println();
//		
//		int[] point1 = new int[5];
//		int[] point2 = new int[5];
//		int[] point3 = new int[5];
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("1반 : ");
//		for(int i = 0; i<5; i++) {
//			point1[i] = scanner.nextInt();
//		}
//		System.out.println("2반 : ");
//		for(int i = 0; i<5; i++) {
//			point2[i] = scanner.nextInt();
//		}
//		System.out.println("3반 : ");
//		for(int i = 0; i<5; i++) {
//			point3[i] = scanner.nextInt();
//		}
//		int sum1 =0;
//		int sum2 =0;
//		int sum3 = 0;
//		for(int i=0; i<5; i++) {
//			sum1 = sum1 + point1[i];
//			sum2 = sum2 + point2[i];
//			sum3 = sum3 + point3[i];
//		}
//		
//		int sum= sum1 + sum2 + sum3;
//		
//		System.out.println("1반 평균 : "+ sum1/5);
//		System.out.println("2반 평균 : "+ sum2/5);
//		System.out.println("3반 평균 : "+ sum3/5);
//		
//		System.out.println("전체 평균 : "+ sum/15);
//		
//		int [][] points = new int[3][5];
//		Scanner scanner =new Scanner(System.in);
//		for(int i=0; i<3; i++) {
//			System.out.print((i+1)+"반 : ");
//			for(int j=0; j<5;j++) {
//				points[i][j]= scanner.nextInt();
//			}
//		}
//		int total = 0;
//		int classTotal = 0;
//		for(int i=0; i<3; i++) {
//			
//			classTotal =0;
//			for(int j=0; j<5;j++) {
//				classTotal += points[i][j];
//			}
//			total =total + classTotal;
//			System.out.println((i+1)+"반의 평균 : "+(classTotal/5.0) );
//		}
//		System.out.println("전체평균 : " + total/15.0);
//		
		int[][] arr =
			{
				{10, 20, 30},
				{20, 30, 40},
				{30, 40, 50}
			};
		
		int[][] newArr= new int [4][4];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j];
				
				newArr[i][3] += arr[i][j];
				newArr[3][j] += arr[i][j];
				newArr[3][3] += arr[i][j];
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(newArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
