package study.practice.practice19;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int pitcherBall;//투수가 던지 공의 값
		int playerBall;//타자가 선택한 값
		int outCount = 0;//아웃개수
		
		for(int round=1; round<=3; round++) {
			System.out.println("===="+ round + "회차시작====");
			outCount = 0;	//회차 시작시 아웃갯수0으로 초기화
			while(true) {//1회차
				
				pitcherBall =((int)(Math.random()*10)+1);	
				
				System.out.print("타자입력(1~10) : ");
				playerBall =scanner.nextInt();
				
				System.out.printf("투수:%d 플레이어:%d \n",pitcherBall,playerBall);
				
				if(pitcherBall == playerBall){
					System.out.println("안타!");
				} else {
					outCount++;
					System.out.println("아웃!");
				}
				
				if(outCount==3) {
					System.out.println("===="+ round + "회차종료====");
					break;
				}
			}
		}
		
		System.out.println("====게임종료====");
		
		
		
	}

}
