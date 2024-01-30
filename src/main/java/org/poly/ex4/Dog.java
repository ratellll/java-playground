package org.poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("바우와우");
    }

    @Override
    public void move() {
        System.out.println(" 멍 무브");
    }
}
