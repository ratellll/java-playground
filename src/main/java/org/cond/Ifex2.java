package org.cond;

public class Ifex2 {
    public static void main(String[] args) {
        int distance = 150;

        if (distance <= 1) {
            System.out.println("도보이용");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        }else {
            System.out.println("뱡기");
        }

    }
}
