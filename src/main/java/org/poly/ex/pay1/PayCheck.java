package org.poly.ex.pay1;

public class PayCheck {

    Pay pay;
    public static Pay payCheck(String option) {

        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new FailPay();
        }
    }
}
