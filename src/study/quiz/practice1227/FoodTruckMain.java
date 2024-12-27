package study.quiz.practice1227;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class FoodTruckMain {

	public static void main(String[] args) {
		FoodTruck ft = new FoodTruck();

		ft.startFoodTruck();

		ft.addFood(new Food("김밥", 3500, 20));
		ft.addFood(new Food("떡볶이", 5000, 30));
		ft.addFood(new Food("순대", 5000, 25));
		ft.addFood(new Food("모듬튀김", 1500, 40));

		ft.foodMenu();

		ft.addFoodStock("김밥", 0);
	}

}

class Food { // 음식정보
	protected String menu; // 메뉴
	protected int price; // 가격
	protected int stock; // 재고
	public char[] foodMenu;

	public Food(String menu, int price, int stock) {
		this.menu = menu;
		this.price = price;
		this.stock = stock;
	}

}

class FoodTruck { // 푸드트럭 기능
	List<Food> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	int totalSales = 0; // 총매출
	boolean isOpened = false;

	void startFoodTruck() {
		isOpened = true;
		System.out.println("푸드트럭 장사 시작");
		System.out.println();
		while (isOpened) {

			System.out.println("==== menu ====");
			System.out.println("1.메뉴보기");
			System.out.println("2.주문하기");
			System.out.println("3.재고관리");
			System.out.println("4.마감하기");
			System.out.print("입력: ");

			String input = scanner.nextLine();
			int menuIndex = 0;
			try {
				Integer.parseInt(input);
			} catch (Exception e) {
				menuIndex = 0;
			}
			
			switch(menuIndex) {
			case 1:
				
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				isOpened=false;
				System.out.println("푸드트럭 장사 마감");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
	}

	public void addFood(Food food) { // 음식종류 추가
		list.add(food);
	}

	public void addFoodStock(String menu, int stock) { // 음식 재고 추가
		System.out.print("추가할 양을 입력하여 주십시오 : ");
		int addStock = scanner.nextInt();
		for (Food food : list) {
			if (food.menu.equals(menu)) {
				stock = stock + addStock;
				System.out.println(menu + "이(가)" + addStock + "만큼 보충되었습니다. 현개수 : " + stock);
				return;
			}
		}

	}

	public void foodMenu() { // 메뉴확인
		for (Food food : list) {
			System.out.println(food.menu + " 가격 " + food.price + "원" + " 재고 " + food.stock + "개 ");

		}
	}

	public void orderMenu() { // 주문하기

		System.out.println("");
	}
}