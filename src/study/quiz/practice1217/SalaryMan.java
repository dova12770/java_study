package study.quiz.practice1217;

public class SalaryMan {
	private static int salary;
	
	public SalaryMan(int salary) {
		this.salary=salary;
	}
	public SalaryMan() {
		this.salary=1000000;
	}
	public int getAnnualGross() {
		int money=(salary*12)+(salary*5);
		return money;
	}

public static void main(String[] args) {
	System.out.println(new SalaryMan().getAnnualGross());
	System.out.println(new SalaryMan(2000000).getAnnualGross());
}
}
