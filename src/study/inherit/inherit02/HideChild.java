package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HideChild extends Parent{

	public HideChild(int money) {
		super(money);
	}
	public void PrintInfo() {
		System.out.println(money);
	}
}
