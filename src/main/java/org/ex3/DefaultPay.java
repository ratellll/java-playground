package org.ex3;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제수단이없습니다");
        return false;
    }
}
