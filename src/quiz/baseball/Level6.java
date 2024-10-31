package quiz.baseball;

import java.util.Scanner;

public class Level6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] people={"A","B","C","D","E","F","G","H","I"};
		int[] run = new int[9];//타석
		int[] hit = new int[9];//안타
		int[] out = new int[9];//아웃
		int[] ball4= new int[9];//볼넷
		
		double avg=0;	//타율
		int player=0;	//타자 랜덤숫자
		int ball=0;		//투수 랜덤숫자
		int strike=0;	//스트라이크수
		int beta=0;		//볼
		int gamma=1;	//회차
		int zeta=0;		//총아웃수
		int anta=0;		//안타수
		int peopleIndex=0;//배열인덱스용
		
		int home=0;		//홈	
		int base1=0;	//1루
		int base2=0;	//2루
		int base3=0;	//3루
		
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
			System.out.printf("타율 : %7.2f (안타: %d 타석:%d 볼넷:%d 아웃:%d)\n"
					,avg,hit[peopleIndex],run[peopleIndex],ball4[peopleIndex],out[peopleIndex]);
			
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
				ball4[peopleIndex]++;
			}
			if(anta==1) {
				base1=1;
			} else if(anta==2) {
				base2=1;
			} else if(anta==3) {
				base3=1;
			} else if(anta==4) {
				home=1;
			}
			if(strike==3) {//스트라이크3번이면 아웃카운터상승
				zeta++;	//아웃카운터
				out[peopleIndex]++;
			}
			if(zeta==3) {
				System.out.println(gamma+"회차종료");
				peopleIndex++;
				base1=0;
				base2=0;
				base3=0;
				zeta=0;
				anta=0;
				beta=0;
				strike=0;
				gamma++;
				break;
			}
			if(strike==3||anta==1) {
				peopleIndex++;					//선수교체하면서 안타,볼,스트라이크 초기화
				anta=0;
				beta=0;
				strike=0;
				break;
				}
			}
		}
		System.out.println("종료. 획득점수 : "+home);
	}

}
