package quiz;

public class Quiz1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] beta = new int[5][5];
		for(int i=0;i<beta.length;i++) {
			for(int j=0;j<beta.length;j++) {
				if(i==j) {
					beta[i][j] =1;
				} else if(i<j) {
					beta[i][j] =2;
				} else if(i>j) {
					beta[i][j] =3;
				} else {}
			}
		}
		for(int i=0;i<beta.length;i++) {
			for(int j=0;j<beta.length;j++) {
				System.out.print(beta[i][j]+" ");
			}
			System.out.println();}
	}

}
