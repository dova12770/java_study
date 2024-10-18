package study.quiz;

public class Practice1018_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		/*
		if (num <=12) {
			System.out.println("오전입니다.");
			if(num <= 6) {
				System.out.println("이른 오전입니다.");
			} else {
				if(num > 6) {
					System.out.println("늦은 오전입니다.");
							}
					}
			} else if(num <=24) {
				System.out.println("오후입니다.");
				if(num <= 18) {
					System.out.println("이른 오후입니다.");
				} else {
					if(num <= 24) {
						System.out.println("늦은 오후입니다.");
								}
						}
				} else {
					System.out.println("잘못입력했습니다.");
				}
				*/
		if (num <=12 && num <= 6) {
			System.out.println("오전입니다.");
			System.out.println("이른 오전입니다.");
		} else if(num <=12 && num > 6) {
			System.out.println("오전입니다.");
			System.out.println("늦은 오전입니다.");
		} else {
			if(num <=24 && num <= 18) {
				System.out.println("오후입니다.");
				System.out.println("이른 오후입니다.");
			} else if (num <=24) {
				System.out.println("오후입니다.");
				System.out.println("이른 오후입니다.");
			} else {
				System.out.println("잘못입력했습니다.");
			}
		}
		
		if (diceNum == 1) {
			System.out.println("1");
		} else if (diceNum == 2) {
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		}
		else if (diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}
		
		String localNum = "02";
		switch(localNum) {
		case "031": 
			System.out.println("경기도입니다.");
			break;
		case "02": 
			System.out.println("서울입니다.");
			break;
		case "041": 
			System.out.println("충남입니다.");
			break;
		case "051": 
			System.out.println("부산입니다.");
			break;
		}
		
		int score = 86;
		switch(score) {
		case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90: 
			System.out.println("학점A");
			break;
		case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80: 
			System.out.println("학점B");
			break;
		case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70: 
			System.out.println("학점C");
			break;
		default: 
			System.out.println("학점F");
			break;
		}
	}

}
