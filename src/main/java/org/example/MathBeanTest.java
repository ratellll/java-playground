package org.example;

public class MathBeanTest {

    public static void main(String[] args) {
        MathBean math = new MathBean();

        math.getOne();
        math.plus(1, 2);
        math.printClassName();
        math.printNumber(1);
    }

    public static void printVersion() {
        System.out.println("1.0.0");
    }
}
