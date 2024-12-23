package quiz.baseball;

import java.util.Scanner;

public class Level7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String[] people={"A","B","C","D","E","F","G","H","I"};
		int[] run = new int[9];//타석
		int[] hit = new int[9];//안타
		int[] out = new int[9];//아웃
		int[] ball4= new int[9];//볼넷
		
		boolean hr=false;	//홈런시도
		double avg=0;	//타율
		int player=0;	//타자 랜덤숫자
		int ball=0;		//투수 랜덤숫자
		int strike=0;	//스트라이크수
		int beta=0;		//볼
		int gamma=1;	//회차
		int zeta=0;		//총아웃수
		int anta=0;		//안타수
		int peopleIndex=0;//배열인덱스용
		
		int homerun=0;
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
				System.out.print(people[peopleIndex]+"타자 ");
				System.out.printf("타율 : %7.2f (안타: %d 타석:%d 볼넷:%d 아웃:%d)\n"
						,avg,hit[peopleIndex],run[peopleIndex],ball4[peopleIndex],out[peopleIndex]);
				
				player=((int)(Math.random()*100)+1);//타자숫자
				ball=((int)(Math.random()*100)+1);//투수숫자
				homerun=((int)(Math.random()*100)+1);//홈런확률
				
				if(player==ball && (player>=player-3||player<=player+3)) {
					anta++;	//안타
					hit[peopleIndex]++;
					run[peopleIndex]++;
					hr=true;
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
				if(hr) {	//홈런
					int megahit=((int)(Math.random()*60)+1);	//홈런난수
					if(homerun<megahit&&megahit>0) {
						home=home+base1+base2+base3;
						base1=0;
						base2=0;
						base3=0;
						hr=false;
						System.out.println("***homerun***");
					}
				} else if(anta==1) {
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
