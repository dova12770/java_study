package study.book;

import java.util.Scanner;

public class memojang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a =0;
		String b= "";
		b = Integer.valueOf(b);*/
	}
	
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int alpha = Integer.parseInt(a+""+b);
        int beta = Integer.parseInt(b+""+a);
        if(alpha>beta){
            answer +=alpha;
        } else {
            answer += beta;
            }
        return answer;
    }
}