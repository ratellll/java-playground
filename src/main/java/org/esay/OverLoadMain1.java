package org.esay;

public class OverLoadMain1 {
    public static void main(String[] args) {

        System.out.println(add(3,5));
        System.out.println(add(3,5,6));
        System.out.println(add(3L,5L,7L,3L));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(int a, int b, int c) {
        return a + b + c;
    }

    public static Long add(Long a, Long b, Long c, Long d) {
        return a + b + c * d;
    }
}
