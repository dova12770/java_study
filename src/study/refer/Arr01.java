package study.refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
		
		int score1 = 100;
		int score2 = 75;
		int score3 = 86;
		int score4 = 62;
		int score5 = 94;
		
		int sum = 0;
		sum =score1 + score2 + score3 + score4 + score5;
		double avg =sum / 5.0 ;
		
		System.out.printf("총점:%d 평균: %.2f\n", sum, avg);
		
		sum= sum + score1;	//sum +=score1;
		sum= sum + score2;
		sum= sum + score3;
		sum= sum + score4;
		sum= sum + score5;
		
		//scores scoreArr scoreArray
		int[] scores = {100, 75, 86, 62, 94};	//5
		
		sum = 0;
		sum = scores[0] + scores[1] 
				+ scores[2]+ scores[3]+ scores[4];
		
		sum = 0;
		sum = sum +scores[0];
		sum = sum +scores[1];
		sum = sum +scores[2];
		sum = sum +scores[3];
		sum = sum +scores[4];
		
		sum =0;
		for(int i=0; i<=4; i++) {
			sum = sum+scores[i];
			//				0 1 2 3 4
		}
		System.out.println("총합 :" +sum);
		
		
		int[] pointArr =null;
		//pointArr = {1,2,3,4,5}; XXX
		
		pointArr = new int[] {1,2,3,4,5}; //O
		
		pointArr = new int[5];
		pointArr[0] = 1;
		pointArr[1] = 2;
		pointArr[2] = 3;
		pointArr[3] = 4;
		pointArr[4] = 5;
		
		
		for(int i=0; i<5; i++) {
			//i:0 1 2 3 4
			//값 : 1 2 3 4 5 
			pointArr[i] = i+1;	//0 = 0+1
								//1 = 1+1
		}
		
		for(int i=1; i<=5; i++) {
			// i 	: 1 2 3 4 5 저장할 값
			//index	: 0 1 2 3 4
			pointArr[i-1] = i;  //1-1 = 1
								//2-1 = 2
		}
		
		for(int i=0; i<5; i++) {
			System.out.print( pointArr[i] + " ");
		}
		System.out.println();
		
		
		int[] intArr =new int[6];
		double[] doubleArr = new double[12];
		String[] strArr = new String[30];
		boolean[] boolArr= new boolean[4];
		
		//	0 1 2 3 4 5  6
		for(int i=0; i<intArr.length ; i++) {
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.print(doubleArr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		
		boolArr[2] = true;
		for(int i=0; i<boolArr.length; i++) {
			System.out.print(boolArr[i]+" ");
		}
		System.out.println();
		
	}

}
