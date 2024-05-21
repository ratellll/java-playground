package org.method;

public class Method1 {
    public static void main(String[] args) {

        int sum1 = add(20, 50);
        System.out.println(sum1);

        int gop = gop(2, 48);
        System.out.println(gop);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // 반환타입을 맞춰야함
    }

    public static int gop(int a, int b) {
        int sum = a * b;
        return sum;
    }
}
