package quiz.baseball;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] people={"A","B","C","D","E","F","G","H","I"};
		
		int ball=0;
		int alpha=0;
		int beta=0;
		int gamma=1;
		int zeta=0;
		int peopleIndex=0;
		while(true){
			System.out.print("숫자를 입력해주세요.(1~10): ");
			int player=scanner.nextInt();
			if(player<1 || player>=10) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			System.out.printf(peopleIndex+1+"번"+people[peopleIndex]+"타자 ");
			peopleIndex++;
			ball=((int)(Math.random()*10)+1);
			if(player == ball) {
				System.out.println("안타");
			} else {
				beta=beta+1;
				alpha=beta;
				zeta=zeta+1;
				System.out.println(alpha+"아웃");
			}
			if(peopleIndex==people.length) {
				peopleIndex=0;}
			if(zeta==9) {
				System.out.println(gamma+"회차 끝");
				break;
				}
			if(beta==3) {
				System.out.println(gamma+"회차 끝");
				gamma=gamma+1;
				beta=0;
				continue;
				}
		}
		}
}
