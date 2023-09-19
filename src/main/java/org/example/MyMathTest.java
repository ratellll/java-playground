package org.example;

public class MyMathTest {

    public static void main(String[] args) {

        int value = MyMath.abs(-5);
        System.out.println(value);

        //MyMath m = new MyMath(); //static이라서 굳이 만들어서 메모리낭비 프라이빗으로 선언후 생성자로 막음
    }
}
