package study.quiz;

import java.util.Scanner;

public class Practice1022_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] score =new int[3];
		for(int i=0; i<score.length;i++) {
			System.out.print("국어점수 :");
			int ko = scanner.nextInt();
			System.out.print("수학점수 :");
			int math = scanner.nextInt();
			System.out.print("영어점수 :");
			int eng = scanner.nextInt();
			int sum = ko+math+eng;	
			double aver = (double)sum/score.length;
		
		if(ko>=40 && math >=40 && eng >=40 && aver>=60) {
			System.out.println("국어 : "+ko+"점");
			System.out.println("수학 : "+math+"점");
			System.out.println("영어 : "+eng+"점");
			System.out.println("합계 : "+sum+"점");
			System.out.println("평균 : "+aver+"점");
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		break;
		}
	}

}
