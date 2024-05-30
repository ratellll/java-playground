package org.oop.ex2;

public class Account {
    int balance;


    // 반환 타입을 설정해도되고 void로 해도된다
    // 항상 용도를 생각해서 결정해야함.
    //객체 내의 필드의 상태만 바꾸는것이라면 void로
    // 해당 필드를 꺼내서 사용해야한다면 반환타입을 지정해줘야함
    int deposit(int amount) {
        balance += amount;
        System.out.println(amount + " 원이 입금 되었습니다.");
        System.out.println("현재 잔액 : " + balance);
        return balance;
    }

    int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " 원이 출금 되었습니다.");
            System.out.println("현재 잔액 : " + balance);
        }else {
            System.out.println("잔액이 부족합니다 ");
            System.out.println("현재 잔액 : " + balance);
        }

        return balance;
    }
    void check () {
        System.out.println(" 현재 잔액은 " + balance + " 원 입니다 .");
    }
}
