package study.practice.Practice23;

public class Account {

	private String owner;
	private long balance;
	
	public Account() {
		owner = null;
		balance =0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance) {
		owner = null;
		this.balance =balance;
	}
	
	public Account (String owner, long balance) {
		this.owner =owner;
		this.balance = balance;
	}
	
	public Account (long balance, String owner) {
		this.owner =owner;
		this.balance = balance;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		balance += amount;
		return amount;
	}
	
	public long withdraw(long amount) {
		if(amount>balance) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재잔액: "+ balance+"원");
			return 0;
//			amount =balance;
//			balance =0;
//			return amount;
		}
			balance -=amount;
			
		
		return amount;
	}
}
