package org.method;

public class MethodEx1 {
    public static void main(String[] args) {

        avg(10, 5, 33);
        System.out.println(average(34, 51, 11));

    }

    public static void avg(int a, int b, int c) {

        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println(avg);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
