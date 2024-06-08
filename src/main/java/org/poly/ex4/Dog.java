package org.poly.ex4;

public class Dog extends AbstractAnimal {


    private String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("챱챱챱챱");
    }

    @Override
    public void name() {
        System.out.println("내 이름은  " + name);
    }
}
