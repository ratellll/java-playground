package org.extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10 ,20); //생성자가 존재할경우 기본생성자이 안됨
        System.out.println("Class C 생성자");
    }
}
