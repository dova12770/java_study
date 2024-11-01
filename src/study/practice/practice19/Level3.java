package study.practice.practice19;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//9명의 선수등록 및 이름
		String[] playerArr = {"A","B","C","D","E","F","G","H","I"};
		
		int playerIndex = 0; //선수 순번(차례)를 저장
		
		int pitcherBall;//투수가 던지 공의 값
		int playerBall;//타자가 선택한 값
		int outCount = 0;//아웃개수
		
		for(int round=1; round<=3; round++) {
			System.out.println("===="+ round + "회차시작====");
			outCount = 0;	//회차 시작시 아웃갯수0으로 초기화
			while(true) {//1회차
				
				//타자입장
				System.out.printf(">>> %d번 타자 %s 입장! <<<\n" ,(playerIndex+1), playerArr[playerIndex]);
				
				//투수가 던진 공 
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
				
				playerIndex++;	//다음 선수로 인덱스 변경
				
				//9번선수 다음은 1번선수
				//index : 8 다음은 0
				if(playerIndex ==9)
					playerIndex =0;
				
				if(outCount==3) {
					System.out.println("===="+ round + "회차종료====");
					break;
				}
			}
		}
		
		System.out.println("====게임종료====");
		
		
		
		

	}

}
