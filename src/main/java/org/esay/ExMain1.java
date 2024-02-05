package org.esay;

public class ExMain1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        add(a, b, c);

        int x = 15;
        int y = 25;
        int z = 35;
        add(x, y, z);

    }

    public static double add(double a, double b,double c) {
        double sum = a+b+c;
        System.out.println((int)sum);
        sum = sum / 3.0;
        System.out.println(sum);
        return sum;
    }
    public static double avr(int a, int b , int c) {
        double sum = a + b + c;
        double av = sum / 3.0;
        System.out.println(av);
        return av;
    }


}
