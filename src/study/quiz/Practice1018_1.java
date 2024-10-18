package study.quiz;

import java.util.Scanner;

public class Practice1018_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		Scanner scanner = new Scanner(System.in);
		System.out.print("높이 : ");
		double a =scanner.nextDouble();
		System.out.println("높이=" + a);
		
		System.out.print("밑변 : ");
		double a1 = scanner.nextDouble();
		System.out.println("밑변=" + a1);
		
		System.out.println((a*a1/2) + "=" + a + "*" + a1 + "/2"  );
		
		//2.
		System.out.print("윗변길이 : ");
		double b=scanner.nextDouble();
		System.out.println("윗변길이=" + b);
		
		System.out.print("밑변 : ");
		double b1 = scanner.nextDouble();
		System.out.println("밑변 길이=" + b1);
		
		System.out.print("높이 : ");
		double b2 = scanner.nextDouble();
		System.out.println("높이=" + b2);
		
		System.out.println(((b+b1)*b2/2) + "=" + "(" + b + "+" + b1+")" + "*" + b2 + "/2");
		
		//3.
		int co = 100;
		int pe = 24;
		int co1= co/pe;
		System.out.println(co1);
		int co2= co%pe;
		System.out.println(co2);
		
		//4.
		System.out.println();
		int d = scanner.nextInt();
		System.out.println("백의자리 : " + d/100);
		System.out.println("십의자리 : " + d%100/10);
		System.out.println("일의자리 : " + d%10);
		
		
		//5.
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		int z = x;
		x=y ;
		y=z;
		System.out.println("x="+x+ " y="+y);
		

	}

}
