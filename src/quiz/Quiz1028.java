package quiz;

public class Quiz1028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] beta= new int[4][4];
		int num =1;
		/*
		for(int i=0; i<beta.length; i++) {
			for(int j=0; j<beta.length; j++) {
				beta[i][j]=num;
				num++;
			}
		}
		for(int i=0; i<beta.length; i++) {
			for(int j=0; j<beta.length; j++) {
				System.out.print(beta[i][j]+" ");
			}System.out.println();
		}
		*/
		for(int i=0; i<beta.length; i++) {
			for(int j=0; j<beta.length; j++) {
				beta[i][j]=num;
				
			}
		}
		for(int i=0; i<beta.length; i++) {
			for(int j=0; j<beta.length; j++) {
				System.out.print(beta[i][j]+" ");
			}System.out.println();
		}
	}

}
