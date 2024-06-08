package org.poly.ex4;

public class Cat extends AbstractAnimal {

    private String name;


    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("사뿐사뿐");
    }

    @Override
    public void name() {
        System.out.println("내 이름은  " + name);
    }
}
