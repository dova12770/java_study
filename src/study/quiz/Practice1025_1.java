package study.quiz;

import java.util.Scanner;

public class Practice1025_1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int ice=0;
		int cafe=0;
		int ban=0;
		int menu1 = 0;
		int menu2 = 0;
		int menu3 = 0;
		while(true) {
			System.out.println("========메뉴============");
			System.out.println("1.아메리카노	3500원");
			System.out.println("2.카페라떼	4100원");
			System.out.println("3.바닐라라떼	4300원");
			System.out.println("=======================");
			System.out.println();
			
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			if(menu<1 || menu>3) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;}
			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			String yn = scanner.next();
			
			if(menu==1) {
				 menu1=menu1+count;
			} else if(menu==2) {
				 menu2=menu2+count;
			} else if(menu==3) {
				 menu3=menu3+count;
			} else {}
			ice=menu1*3500;
			cafe=menu2*4100;
			ban=menu3*4300;
			if(yn.equals("y")) {
			} else if(yn.equals("n")) {
				System.out.println("======================");
				if(menu1!=0) {
					System.out.println("아메리카노"+menu1+"잔 : "+ice+"원");} else {}
				if(menu2!=0) {
					System.out.println("카페라떼"+menu2+"잔 : "+cafe+"원");} else {}
				if(menu3!=0) {
					System.out.println("바닐라라떼"+menu3+"잔 : "+ban+"원");} else {}
				System.out.println("======================");
				System.out.println("총액:"+(ice+cafe+ban)+"원");
				break;
			} else {System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			
		}
		}
		
		
	}

}
