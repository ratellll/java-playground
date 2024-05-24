package org.method;

public class Method8 {
    public static void main(String[] args) {


        System.out.println("계산 후"+add(10, 10));
        System.out.println("계산 후"+add(10, 20));
        System.out.println("계산 후"+add(50, 1, 4));

    }

    public static int add(int a, int b) {
        System.out.println("메서드 안" );
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("메서드 안1" );
        return a + b + c;
    }
}
