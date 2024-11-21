package quiz.baseball;

import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] people={"A","B","C","D","E","F","G","H","I"};
		int[] run = new int[9];//타석
		int[] hit = new int[9];//안타
		
		double avg=0;	//타율
		int player=0;	//타자 랜덤숫자
		int ball=0;		//투수 랜덤숫자
		int strike=0;	//스트라이크수
		int beta=0;		//볼
		int gamma=1;	//회차
		int zeta=0;		//총아웃수
		int anta=0;		//안타수
		int peopleIndex=0;//배열인덱스용
		
		while(gamma<4) {
			System.out.println(gamma+"회차 시작");
		while(gamma<4){
			if(peopleIndex==people.length) {
				peopleIndex=0;
				}
			if(hit[peopleIndex]>0) {
				avg=((double)hit[peopleIndex]/(run[peopleIndex]));
			}
			System.out.print(peopleIndex+1+"번"+people[peopleIndex]+"타자 ");
			System.out.printf("타율 : %7.2f (안타: %d 타석:%d)\n"
					,avg,hit[peopleIndex],run[peopleIndex]);

			
			player=((int)(Math.random()*100)+1);
			ball=((int)(Math.random()*100)+1);
			
			if(player==ball && (player>=player-3||player<=player+3)) {
				anta++;	//안타
				hit[peopleIndex]++;
				run[peopleIndex]++;
				System.out.println("안타");
			} else if((ball>=1 && ball<=20)||(ball>=50 && ball<=60)||(ball>=90 && ball<=100)) {
				strike++;	//스트라이크
				run[peopleIndex]++;
				System.out.println("스트라이크");
			} else {
				beta++;	//볼
				run[peopleIndex]++;
				System.out.println("볼");
			}

			if(beta==4) {//볼4면 안타
				anta++;
				hit[peopleIndex]++;
			}
			if(strike==3) {//스트라이크3번이면 아웃카운터상승
				zeta++;	//아웃카운터
			}
			if((strike==3||anta==1)&&zeta==3) {	//스트라이크3번이거나 안타1번이면
				System.out.println(gamma+"회차종료");
				peopleIndex++;					//선수교체하면서 안타,볼,스트라이크 초기화
				anta=0;
				beta=0;
				strike=0;
				gamma++;
				break;
			} else if(strike==3||anta==1) {
				peopleIndex++;					//선수교체하면서 안타,볼,스트라이크 초기화
				anta=0;
				beta=0;
				strike=0;
				break;
			}

			
			if(zeta==3) {
				System.out.println(gamma+"회차종료");
				zeta=0;
				gamma++;
				break;
			}

		}
		}
	}
	
}
