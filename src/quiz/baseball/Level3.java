package quiz.baseball;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] people={"A","B","C","D","E","F","G","H","I"};
		int[] run = new int[9];//타석
		int[] hit = new int[9];//안타
		
		double avg=0;	//평균
		int a=0;
		int ball=0;		//컴퓨터 랜덤숫자
		int alpha=0;	//아웃수저장
		int beta=0;		//아웃
		int gamma=1;	//회차
		int zeta=0;		//총아웃횟수제한
		int anta=0;		//안타수
		int peopleIndex=0;//배열인덱스용

		while(true){
			System.out.print("숫자를 입력해주세요.(1~10): ");
			int player=scanner.nextInt();
			if(player<1 || player>=10) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			run[peopleIndex]=a;
			System.out.print(peopleIndex+1+"번"+people[peopleIndex]+"타자 ");
			if(run[peopleIndex]>=0) {
				avg=((double)hit[peopleIndex]/(run[peopleIndex]+1));
				System.out.printf("타율:"+avg+"("+ hit[peopleIndex]+" "+a+")");
			}
			peopleIndex++;
			
			System.out.println();
			ball=((int)(Math.random()*10)+1);
			if(player == ball) {
				anta++;
				System.out.println("안타");	
				hit[peopleIndex-1]+=anta;
			} else {
				beta++;
				alpha=beta;
				zeta++;
				System.out.println(alpha+"아웃");
			}
			if(peopleIndex==people.length) {
				peopleIndex=0;
				run[peopleIndex]++;
				a=run[peopleIndex]++;
			}
			if(zeta==27) {
				System.out.println(gamma+"회차 끝");
				break;
				}
			if(beta==3) {
				System.out.println(gamma+"회차 끝");
				gamma++;
				beta=0;
				continue;
				}
		}
		
	
	}
}


