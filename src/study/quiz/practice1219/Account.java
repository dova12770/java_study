package study.quiz.practice1219;

	public class Account {
	    private String owner;
	    private long balance;

	    
	    public Account() {
	        this.owner = "Unknown";
	        this.balance = 0;
	    }

	    
	    public Account(String owner, long balance) {
	        this.owner = owner;
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
	        if (amount > 0) {
	            balance += amount;
	        }
	        return balance;
	    }

	    public long withdraw(long amount) {
	        if (amount > balance) {
	            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
	        } else {
	            balance -= amount;
	        }
	        return balance;
	    }


	}

