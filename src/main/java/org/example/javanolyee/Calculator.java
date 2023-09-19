package org.example.javanolyee;

public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }



    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int value = cal.plus(1, 2);
        System.out.println(value);

        int value2 = cal.minus(1, 2);
        System.out.println(value2);
    }
}
