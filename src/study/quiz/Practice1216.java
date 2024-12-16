package study.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] lotto = new int[6]; //로또번호
		int[][] firArr =new int[3][5];
		int[] sum = new int[3];
		int[] average = new int[3];
		int[][] arr = {{10,20,30},{20,30,40},{30,40,50}};
		int a = 0; 	//1~6 숫자
		int b = 0;	//1~6 숫자
		int total = 0;
		
//		1.
		for(a=1; a<=6; a++) {
			for(b=1; b<=6; b++) {
				if(a+b==6) {
					System.out.println("("+a+","+b+")");
				}
			}
		}
		System.out.println();
		
//		2.
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=((int)(Math.random()*45)+1);
			for(int j =0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}	
		}
		for(int j=0; j<lotto.length; j++) {
			System.out.print(lotto[j]+" ");
			}
		System.out.println();
		
//		3.
		for(int i=0; i<firArr.length; i++) {
			for(int j=0; j<firArr[i].length; j++) {
				firArr[i][j]= scanner.nextInt();
				sum[i]+=firArr[i][j];
			}
		}
		for(int i=0; i<firArr.length; i++) {
			System.out.print((i+1)+"반 : ");
			System.out.println(Arrays.toString(firArr[i]));
		}
		for(int i=0; i<firArr.length; i++) {
			average[i]= sum[i] / 5;
			System.out.print((i+1)+"반 평균: ");
			System.out.println(average[i]);
			total += sum[i];
		}
		System.out.println("전체평균 : "+(total/15));
		
//		4.
		
	}
}
