package study.book;

import java.util.Scanner;

public class Memojang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a =0;
		String b= "";
		b = Integer.valueOf(b);*/
	}
	
}
class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        if(control.equals('w')){
            answer+=1;
        }else if(control.equals('n')){
            answer-=1;
        }else if(control.equals('d')){
            answer+=10;
        }else if(control.equals('a')){
            answer-=10;
        }
        
        return answer;
    }
}