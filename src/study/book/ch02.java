package study.book;

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
		

	}

}
