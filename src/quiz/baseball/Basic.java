package quiz.baseball;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int ball=0;
		int beta=0;
		while(true){
			System.out.print("숫자를 입력해주세요.(1~10): ");
			int player=scanner.nextInt();
			if(player<1 || player>=10) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			ball=((int)(Math.random()*10)+1);
			if(player == ball) {
				System.out.println("안타");
			} else {
				beta=beta+1;
				System.out.println("아웃");
			}
			if(beta==3) {
				System.out.println("3아웃 체인지");
				break;
		}
		
		}
	}

}
