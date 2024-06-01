package org.access;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(100000);
        ba.withdraw(1000000);
        System.out.println("현재 잔액 = " + ba.getBalance());

        ba.withdraw(50000);
        System.out.println("현재 잔액 = " + ba.getBalance());
    }
}
