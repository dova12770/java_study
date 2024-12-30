package quiz.Test;

import java.util.Scanner;

class Roulette {

    static boolean startGame;

    public static void gameStart(Gamer gamer) {
        startGame = true;
        Scanner scanner = new Scanner(System.in);

    	System.out.println("게임시작");
    	System.out.println();

        while (startGame) {

        	showMenu();
        	
            System.out.print("메뉴를 선택하세요: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    charge(gamer);
                    break;
                case 2:
                    random(gamer);
                    break;
                case 3:
                    close(gamer);
                    startGame = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
        scanner.close();
    }

    public static void showMenu(){
    	System.out.println();
        System.out.println("=====[메뉴선택]=====");
        System.out.println("1.금액충전  2.게임하기 3.그만하기");

    }
    public static void charge(Gamer gamer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("충전할 금액을 입력하세요(천원단위로 입력해 주세요): ");
        int money = scanner.nextInt();

        if (money % 1000 == 0) {
            gamer.totalSales += money;
            gamer.v_count += (money / 1000) * 2;
            System.out.println("충전 완료! 잔여 시도 회수: " + gamer.v_count);
        } else {
            System.out.println("천원 단위로만 충전 가능합니다.");
        }
    }

    public static void random(Gamer gamer) {
        if (gamer.v_count <= 0) {
            System.out.println("잔여 시도 회수가 부족합니다");
            return;
        }

        gamer.v_count--;
        System.out.println("룰렛이 돌아갑니다.");
        int random = (int) (Math.random() * 6) + 1;
        System.out.println("나온 숫자는 " + random + "입니다.");

        if (random >= 1 && random <= 4) {
            int points = random;
            gamer.s_count++;
            gamer.totalPoint += points;
            System.out.println("성공입니다! +" + points + "점 현재 점수: " + gamer.totalPoint+"점"
            +" 승리횟수: "+gamer.s_count+"점"+" 패배횟수: "+gamer.f_count+"점"		);
        } else {
            gamer.f_count++;
            System.out.println("실패입니다. +0점 현재 점수: " + gamer.totalPoint+"점"
            +" 승리횟수: "+gamer.s_count+"점"+" 패배횟수: "+gamer.f_count+"점");
        }
    }

    public static void close(Gamer gamer) {
        System.out.println("게임 종료");
        System.out.println("총매출액: " + gamer.totalSales+"원");
    }
}
