package org.poly.ex.pay1;

public class FailPay implements Pay{

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 잘못되었습니다");
        return false;
    }
}
