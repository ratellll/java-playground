package org.poly.ex1;

public class AnimalMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("소리 테스트 ----------");
        dog.sound();
        System.out.println("테스트 종료 ----------");

        System.out.println("소리 테스트 ----------");
        cat.sound();
        System.out.println("테스트 종료 ----------");

        System.out.println("소리 테스트 ----------");
        cow.sound();
        System.out.println("테스트 종료 ----------");

    }
}
