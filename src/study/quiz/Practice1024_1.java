package study.quiz;

import java.util.Scanner;

public class Practice1024_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int cho;
		
		//for(int i=0;true;i++) 
		while(true)
		{
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("5.종료");
		
		System.out.print("메뉴번호를 입력하세요 : ");
		cho =scanner.nextInt();
		
			if(cho==1) {
				System.out.println("입력 메뉴입니다.");
			} else if (cho==2) {
				System.out.println("수정 메뉴입니다.");
			} else if (cho==3) {
				System.out.println("조회 메뉴입니다.");
			} else if (cho==4) {
				System.out.println("삭제 메뉴입니다.");
			} else if (cho==5) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			} else { 
				System.out.println("잘못입력하셨습니다.");}

		System.out.println();
		
		}
		

	}

}
