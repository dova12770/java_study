package study.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruckMain {
	public static void main(String[] args) {
		// FoodTruck 객체 생성
		FoodTruck foodTruck = new FoodTruck();

		// 초기 음식 추가
		foodTruck.addFood(new Food("김밥", 1000, 10));
		foodTruck.addFood(new Food("떡볶이", 3000, 10));
		foodTruck.addFood(new Food("순대", 2500, 10));

		Scanner scanner = new Scanner(System.in);
		boolean startTruck = true;

		System.out.println("==== 푸드트럭 장사 시작 ====");
		System.out.println();
		while (startTruck) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문하기");
			System.out.println("3. 재고 관리");
			System.out.println("4. 마감하기");

			System.out.print("원하는 작업의 번호를 입력하세요: ");
			int choice = scanner.nextInt();
			System.out.println();

			switch (choice) {
			case 1: // 메뉴 보기
				foodTruck.showMenu();
				break;
			case 2: // 주문하기
				foodTruck.showMenu(); // 메뉴 표시
				System.out.print("주문할 음식 이름: ");
				String orderMenu = scanner.next();
				System.out.print("주문할 수량: ");
				int orderCount = scanner.nextInt();
				foodTruck.order(orderMenu, orderCount);
				break;
			case 3: // 재고 관리
				foodTruck.showMenu(); 
				System.out.print("재고를 추가할 음식 이름: ");
				String stockMenu = scanner.next();
				System.out.print("추가할 재고 수량: ");
				int stockCount = scanner.nextInt();
				foodTruck.addStock(stockMenu, stockCount);
				break;
			case 4: // 마감 및 종료
				foodTruck.close(); 
				startTruck = false; 
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
				break;
			}
		}
		scanner.close();
	}
}

class Food {
	String menu; // 메뉴 이름
	int price; // 가격
	int stock; // 재고

	public Food(String menu, int price, int stock) {
		this.menu = menu;
		this.price = price;
		this.stock = stock;
	}
}

class FoodTruck {
	List<Food> list = new ArrayList<>();
	int totalSales = 0; // 총 매출

	// 음식 추가
	public void addFood(Food food) {
		list.add(food);
	}

	// 재고 추가
	public void addStock(String menu, int stock) {
		for (Food food : list) {
			if (food.menu.equals(menu)) {
				food.stock += stock;
				System.out.println(menu + " 재고가 " + stock + "개 추가되었습니다.");
				return;
			}
		}
		System.out.println(menu + "는(은) 메뉴에 없습니다.");
	}

	// 메뉴 보여주기
	public void showMenu() {
		System.out.println("==== 현재 메뉴 ====");
		for (Food food : list) {
			System.out.println(food.menu + " - " + food.price + "원 (재고: " + food.stock + ")");
		}
	}

	// 주문하기
	public void order(String menu, int orderMenu) {
		for (Food food : list) {
			if (food.menu.equals(menu)) {
				if (food.stock >= orderMenu) {
					food.stock -= orderMenu;
					totalSales += food.price * orderMenu;
					System.out.println(menu + " " + orderMenu + "개 주문 완료!");
				} else {
					System.out.println(menu + "는(은) 품절입니다. (남은 재고: " + food.stock + ")");
				}
				return;
			}
		}
		System.out.println(menu + "는(은) 메뉴에 없습니다.");
	}

	// 마감하기
	public void close() {
		System.out.println("==== 마감 ====");
		int loss = 0;

		for (Food food : list) {
			if (food.stock > 0) {
				loss += food.stock * (food.price * 0.3); 
			}
		}

		System.out.println("총 매출: " + totalSales + "원");
		System.out.println("손실: " + loss + "원");
		System.out.println("최종매출: " + (totalSales - loss) + "원");
		System.out.println("장사가 종료되었습니다. 수고하셨습니다!");
	}
}
