package org.oop.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println("=========잔액체크===============");
        ac.check();

        System.out.println("===========입금단계===============");
        ac.deposit(20000);
        ac.deposit(50000);

        System.out.println("==========출금 후 체크================");
        ac.withdraw(60000);
        ac.check();
        System.out.println("===========오버체크 ===============");
        ac.withdraw(20000);

    }
}
