package org.example;

import java.util.Random;

public class javanori {
    public static void main(String[] args) {
        System.out.println(Math.max(20, 100));

        Random random = new Random();

        int rand = random.nextInt(50);
        int rand2 = random.nextInt(50) + 10;

        System.out.println(rand);
        System.out.println(rand2);
        ////////////////////////////////////////////////////////////////////////////////////////
        int i = 10;

        if (i == 10) {
            System.out.println("야삐");
                    }else
            System.out.println("루즈");

        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 < 10);
    }
}
