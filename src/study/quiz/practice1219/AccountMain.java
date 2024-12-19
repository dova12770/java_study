package study.quiz.practice1219;

import study.quiz.practice1219.Account;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account("휴먼", 10000);
        System.out.println("소유자: " + account.getOwner());
        System.out.println("초기 잔액: " + account.getBalance() + "원");

        account.deposit(2000);
        System.out.println("저축 후 잔액: " + account.getBalance() + "원");

        account.withdraw(3000);
        System.out.println("인출 후 잔액: " + account.getBalance() + "원");
        
        account.withdraw(10000);
        System.out.println("인출 후 잔액: " + account.getBalance() + "원");

    }

}
