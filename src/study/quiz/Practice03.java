package study.quiz;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 아래 코드에서 예상되는 출력 결과를 작성하세요
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x="+x + " y="+y);  			5	x2 y3		
		System.out.println(x + y);  					5	x2 y3	
		System.out.println(x++ + y++); 					5	x3 y4		
		System.out.println("x="+x + " y="+y);			7	x3 y4		
		z = ++x + ++y;									9	x4 y5 z9	
		System.out.println("x="+x + " y="+y);			9	x4 y5 z9		
		z--;											8   x4 y5 z8		
		x += --y;										8	x4 y4 z8		
		System.out.println("x="+x + " y="+y + " z="+z);	16  x4 y4 z8		
		x = 10;
		z = x/y++; 										2	x10 y5 z2
		System.out.println("x="+x + " y="+y + " z="+z);	17	x10 y5 z2	
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);	28	x10 y6 z2
		System.out.println("x="+x + " y="+y + " z="+z);	18	x10 y6 z2	
		*/
		
		
		/*
		2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a) );						true
		System.out.println( (a == b ) || ( a >= b) || (c > 10) );	false
		boolean result = !(c == 3);									false
		System.out.println( result );
		*/
		
		/*
		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		6000원 이하 -> "훌륭"
		6000원 초과 ~ 8000원 -> "선방"
		8000원 초과 ~ 12000원 -> "눈물"
		12000원 초과 -> "물로배채우기"
		 */
		int menuPrice = 5000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = (menuPrice > 12000) ? "물로배채우기" : (menuPrice > 8000 ? "눈물": (menuPrice > 6000 ? "선방" : "훌륭")) ;
		System.out.println(result);

	}

}
