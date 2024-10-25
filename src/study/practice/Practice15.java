package study.practice;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		int menu;
		int count;
		String addOrder;
		
		String[] menuArr = {"아메리카노","카페라떼","바닐라라떼"};	//메뉴이름
		int[] priceArr = {3500, 4100, 4300};	//메뉴가격
		int[] countArr = new int[menuArr.length];	//메뉴 주문 수량

		while(true) {
		while(true) {
		System.out.println("========= 메뉴 =========");
		for(int i=0; i<menuArr.length;i++) {
			System.out.printf("%d.%-8s %d원\n",i+1,menuArr[i], priceArr[i]);
		}
		System.out.println("=======================");
		
		System.out.print("메뉴 선택 : ");
		menu = scanner.nextInt();
		
		if(menu >= 1 && menu <= menuArr.length) {
			break;
		} else {
			System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
		}
		}
		/*if( !(menu >= 1 && menu <= menuArr.length)) {
			continue;
		}*/
		
		System.out.print("수량 선택 : ");
		count = scanner.nextInt();
		
		countArr[menu-1] += count;
		
		scanner.nextLine();
			while(true) {
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			addOrder = scanner.nextLine();
			
			if(addOrder.equals("y")||addOrder.equals("n"))
				break;
			 else
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
			
			if(addOrder.equals("n")) {
				int total=0;
				System.out.println("=======================");
				for(int i=0; i<menuArr.length; i++) {
					if(countArr[i] > 0) {
						System.out.printf("%d %s : %d원\n",menuArr[1], countArr[i]*priceArr[i]);
						total = total + (countArr[i]*priceArr[i]);
					}
				System.out.println("=======================");
				System.out.println("총액 : "+total+"원");
				break;
			}
		}
		}
		/*
		int menu;
		int count;
		String addOrder;
		
		int menu1Count =0;
		int menu2Count =0;
		int menu3Count =0;
		
		while(true) {
		
		System.out.println("========= 메뉴 =========");
		System.out.println("1. 아메리카노	3500원");
		System.out.println("2. 카페라떼  	4100원");
		System.out.println("3. 바닐라라떼 	3500원");
		System.out.println("=======================");
		
		System.out.print("메뉴 선택 : ");
		menu = scanner.nextInt();
		if(menu == 1 || menu == 2 || menu ==3) {
			
			System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			
			if(menu ==1)
				menu1Count += count;
			
			if(menu ==2)
				menu2Count += count;
			
			if(menu ==3)
				menu3Count += count;
			
			scanner.nextLine();
			
			while(true) {
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			addOrder = scanner.nextLine();
			if(addOrder.equals("y")||addOrder.equals("n")) {
				break;}
			}
			
			
			if(addOrder.equals("n")) {
				
				if(menu1Count > 0)
				System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
				if(menu2Count > 0)
				System.out.printf("카페라떼 %d잔 : %d원\n", menu1Count, menu1Count*3500);
				if(menu3Count > 0)
				System.out.printf("바닐라라떼 %d잔 : %d원\n", menu1Count, menu1Count*3500);
				
				int total =menu1Count+menu2Count+menu3Count;
				System.out.println("총액 : "+total+"원");
				break;
			}
		} else {
			System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
		}
		}*/
		
		
	}

}
