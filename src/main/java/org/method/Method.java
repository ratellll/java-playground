package org.method;

public class Method {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1번"+num1);
        changeNumber(num1);
         System.out.println("4번"+num1);

    }

    public static void changeNumber(int num2) {
        System.out.println("2번"+num2);
        num2 = num2 * 2;
        System.out.println("3번"+num2);
    }
}
