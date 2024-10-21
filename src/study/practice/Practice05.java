package study.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year =scanner.nextInt();
		
		if(year%4 == 0) {
			System.out.println("윤년 O");
		} else if (year%100 == 0) {
			System.out.println("윤년 X");
		} else if (year%400 == 0) {
			System.out.println("윤년 O");
		} else {
			System.out.println("윤년 X");
		}
		
		if(year%4 == 0) {
			
			if(year%400 ==0) {
				System.out.println("윤년 O");
			} else {
				if(year%100 == 0) {
					System.out.println("윤년 X");
				} else {
					System.out.println("윤년 O");
				}
			}
		} else {
			System.out.println("윤년 X");
		}
		
		if(year%400 == 0 || (year%100 == 0 && !(year%100==0))) {
			System.out.println("윤년 O");
		} else {
			System.out.println("윤년 X");
		}

	}

}
