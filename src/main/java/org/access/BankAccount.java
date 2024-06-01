package org.access;

public class BankAccount {
    private int balance;


    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            System.out.println("입금을 성공하였습니다. | 현재 잔액 = " + balance);
        }else {
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
            System.out.println("출금을 성공하였습니다. | 현재 잔액 = " + balance);
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
            System.out.println("입력 금액 = " + amount);
            System.out.println("현재 잔액 = " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
