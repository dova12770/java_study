package quiz.baseball;

import java.util.Scanner;

public class level4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] people={"A","B","C","D","E","F","G","H","I"};
		int[] run = new int[9];//타석
		int[] hit = new int[9];//안타
		
		double avg=0;	//평균
		int ball=0;		//컴퓨터 랜덤숫자
		int alpha=0;	//아웃수저장
		int beta=0;		//아웃
		int gamma=1;	//회차
		int zeta=0;		//총아웃횟수제한
		int anta=0;		//안타수
		int peopleIndex=0;//배열인덱스용
		int player=0;

		while(true){
			player=((int)(Math.random()*100)+1);
			System.out.print(people[peopleIndex]+"타자 ");
			if(run[peopleIndex]>=0) {
				avg=((double)hit[peopleIndex]/(run[peopleIndex]+1));
				System.out.printf("타율:"+avg+"( "+hit[peopleIndex]+" "+run[peopleIndex]+")");
			}
		
			peopleIndex++;
			System.out.println();
			ball=((int)(Math.random()*100)+1);
			if(player==ball) {
				anta++;
				System.out.println("안타");	
				hit[peopleIndex]+=anta;
			} else {
				beta=beta+1;
				alpha=beta;
				zeta=zeta+1;
				System.out.println(alpha+"아웃");
			}
			if(peopleIndex==people.length) {
				peopleIndex=0;

			}
			if(zeta==27) {
				System.out.println(gamma+"회차 끝");
				break;
				}
			if(beta==3) {
				System.out.println(gamma+"회차 끝");
				gamma=gamma+1;
				beta=0;
				run[peopleIndex]+=1;
				continue;
				}
		}
		
	}
	}

}
