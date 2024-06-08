package org.poly.ex4;

public class Cow extends AbstractAnimal {

    private String name;

    public Cow(String name) {
        this.name = name;
    }
    @Override
    public void sound() {
        System.out.println("음무");

    }

    @Override
    public void move() {
        System.out.println("둥텅둥텅");
    }

    @Override
    public void name() {
        System.out.println("내 이름은  " + name);
    }
}
