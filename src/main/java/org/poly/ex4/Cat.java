package org.poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("먀우");
    }

    @Override
    public void move() {
        System.out.println("냥 이동");
    }
}
