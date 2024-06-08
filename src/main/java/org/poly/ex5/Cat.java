package org.poly.ex5;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냔냐이");
    }

    @Override
    public void move() {
        System.out.println("사쁜사쁜");
    }

    @Override
    public void name() {
        System.out.println("뚱냥스");
    }
}
