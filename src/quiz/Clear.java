package quiz;

import java.util.Scanner;

public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] people={"A","B","C","D","E","F","G","H","I"};
		int[] run = new int[9];//타석
		int[] hit = new int[9];//안타
		int[] out = new int[9];//아웃
		int[] ball4= new int[9];//볼넷
		
		boolean bat=false;	//안타시 몇루타인지 확인용
		boolean hr=false;	//홈런시도
		
		double avg=0;	//타율
		
		int player=0;	//타자 랜덤숫자
		int ball=0;		//투수 랜덤숫자
		int strike=0;	//스트라이크수
		int beta=0;		//볼
		int gamma=1;	//회차
		int zeta=0;		//총아웃수
		int anta=0;		//안타수
		int luta=0;		//루타 확인
		int peopleIndex=0;//배열인덱스용
		int homerun=0;
		int home=0;		//홈	
		int base1=0;	//1루
		int base2=0;	//2루
		int base3=0;	//3루
		while(gamma<4) {
		System.out.println(gamma+"회차 시작");
		
			while(gamma<4) {
			
				if(peopleIndex==people.length) {
					peopleIndex=0;
					}
				if(hit[peopleIndex]>0) {
					avg=((double)hit[peopleIndex]/(run[peopleIndex]));
				}
				System.out.print(peopleIndex+1+"번"+people[peopleIndex]+"타자 ");
				System.out.printf("타율 : %7.2f (안타: %d 타석:%d 볼넷:%d 아웃:%d)\n"
						,avg,hit[peopleIndex],run[peopleIndex],ball4[peopleIndex],out[peopleIndex]);
				
				while(gamma<4){
				player=((int)(Math.random()*100)+1);//타자숫자
				ball=((int)(Math.random()*100)+1);//투수숫자
			
				if(player==ball && (player>=player-3||player<=player+3)) {
					anta++;	//안타
					hit[peopleIndex]++;
					run[peopleIndex]++;
					hr=true;
					bat=true;
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
					System.out.println("4볼");
					anta++;
					hit[peopleIndex]++;
					ball4[peopleIndex]++;
					base1++;
					if(base1==2) {
						base1-=1;
						base2+=1;
					}
					if(base2==2) {
						base2-=1;
						base3+=1;
					}
					if(base3==2) {
						base3=base3-1;
						home+=1;
					}
				}
				
				if(hr) {	//홈런
					int megahit=((int)(Math.random()*60)+1);	//홈런난수
					homerun=((int)(Math.random()*100)+1);//홈런확률
					System.out.println("홈런확률"+homerun);
					System.out.println("선수확률"+megahit);
					if(homerun<megahit&&megahit>0) {
						home=home+base1+base2+base3;
						base1=0;
						base2=0;
						base3=0;
						hr=false;
						System.out.println("***homerun***");
					}else {hr=false;}
				}  
				if(bat) {
				luta=((int)(Math.random()*100)+1);//몇루타인지 확인
				if(luta>0||luta<=70) {
					//1루타
					System.out.println("1루타");
					base1++;
					if(base1==2) {
						base1-=1;
						base2+=1;
					}
					if(base2==2) {
						base2-=1;
						base3+=1;
					}
					if(base3==2) {
						base3=base3-1;
						home+=1;
					}
					bat=false;
				} else if(luta>70||luta<=90) {
				//2루타
					System.out.println("2루타");
				 base2++;
				 if(base1==1){
					base1=0;
				 	base3=1;}
				 	if(base2==2){
				 	base2-=1;
					home+=1;
						if(base3==1){
						base3=0;
						home+=1;}
				 	}
				 	bat=false;
				 } else {
					//3루타
					 System.out.println("3루타");
					base3++;
					if(base1==1){
					 	base1=0;
					 	home+=1;
					 	}
					if(base2==1) {
						base2=0;
						home+=1;
						}
					if(base3==2) {
						base3-=1;
						home+=1;
					}
					bat=false;
				 }
				} else {}
				if(strike==3) {//스트라이크3번이면 아웃카운터상승
					System.out.println("삼진아웃");
					zeta++;	//아웃카운터
					out[peopleIndex]++;
				}
				if(zeta==3) {//총 아웃 횟수가 3번이면
					System.out.println("쓰리아웃 체인지");
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
				if(strike==3||anta==1) {			//스트라이크3번 이거나 안타 1번이면
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
}
