package org.poly.ex5;

public class Cow implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("음무우우우우");
    }

    @Override
    public void move() {
        System.out.println("텁텁텁텁");
    }

    @Override
    public void name() {
        System.out.println("음무맨");
    }
}
