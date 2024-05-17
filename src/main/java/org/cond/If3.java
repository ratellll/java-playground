package org.cond;

public class If3 {
    public static void main(String[] args) {

        int price = 1000;
        int age = 20;
        int discount = 0;

        if (price >= 10000) {
            discount = discount +1000;
        }
        if (age <= 10) {
            discount = discount +1000;
        }
        System.out.println(discount);


    }
}
