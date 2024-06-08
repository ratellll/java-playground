package org.poly.ex3;

public class AbMain1 {
    public static void main(String[] args) {

        //추상클래스는 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.move();
        cat.sound();
        cat.move();
    }
}
