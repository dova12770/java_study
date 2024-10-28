package study.practice;

public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[][] arr =new int[4][4];
		int num =1;
		
		/* //순서대로 숫자부여 기본(가로)
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		//순서대로 숫자부여 기본(세로)
		/*
		for(int j=0; j<4; j++) {
			for(int i=0; i<4; i++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/
		/*
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[j][i] = num;
				num++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/
		/*
		//역순(가로)
		num=16;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = num;
				num--;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/
		/*
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		//역순(세로)
		num=16;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[j][i] = num;
				num--;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
