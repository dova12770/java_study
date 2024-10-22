package study.book;

import java.util.Scanner;

public class ch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 value 선언
		int value = 10;
		
		//연산 결과를 변수 result의 초기값으로 대입
		 int result= value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		 System.out.println(result);
		 
		 int hour =3;
		 int minute = 5;
		 System.out.println(hour + "시간" + minute + "분");
		 
		 int totalMinute = (hour*60) + minute;
		 System.out.println("총 " + totalMinute + "분");
		int x =3;
		int y = 5;
		System.out.println("x:" + x + ", y" + y);
		
		int temp = x;
		x=y;
		y= temp;
		System.out.println("x:" + x + ", y" + y);
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		char c1 ='A';
		char c2 = 65;
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m+ "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m+" x "+n +" = "+(m*n));
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.print("선택:");
			
			String strNum =scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = "+ speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재속도 = "+ speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
