package org.poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍먼");
    }

    @Override
    public void move() {
        System.out.println("챱챱챱챱");
    }

    @Override
    public void name() {
        System.out.println("댕댕이");
    }
}
