package org.extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // 매개변수가 없는 기본생성자일경우 생략가능
        System.out.println("Class B 생성자  a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("Class B 생성자  a = " + a + " b = "+ b);
    }
}
