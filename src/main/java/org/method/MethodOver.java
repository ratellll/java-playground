package org.method;

public class MethodOver {
    public static void main(String[] args) {

        System.out.println(mM(1, 1.5));
    }

    public static int mM(int a, int d) {
        System.out.println("1번 메소드");
        return a + d;
    }
    public static double mM(double a, double d) {
        System.out.println("2번 메소드");
        return a + d;

    }
}
