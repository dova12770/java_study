package quiz;

import java.util.Scanner;

public class Quiz1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		int years = 2024-year+1;
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요. : ");
		int num = scanner.nextInt();
		if(num>=1 && num<=4) {
			if(num == 3 && year>= 2000) {
				System.out.print("결과 : "+ years+ "살 남자입니다.");
			} else if (num == 4 && year>= 2000) {
				System.out.print("결과 : "+ years+ "살 여자입니다.");
			} else if(num == 1 && year< 2000) {
				System.out.print("결과 : "+ years+ "살 남자입니다.");
			} else if (num == 2 && year< 2000) {
				System.out.print("결과 : "+ years+ "살 여자입니다.");
			} else {System.out.println("잘못된 입력입니다.");}
		}

	}
}


