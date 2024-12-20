package study.quiz.practice1220.FoC;

import java.util.ArrayList;
import java.util.List;

public class Novice {

	String name;
	int hp;
	
	List<Wizard> list = new ArrayList<Wizard>();
	
	public void punch() {
		System.out.printf("[%s]의 펀치!!\n", name);
	}
}
