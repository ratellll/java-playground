package org.poly.ex4;


public class Abmain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();


        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);
        soundMove(cat);
        soundMove(caw);
        soundMove(dog);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("울음 시작");
        animal.sound();
        System.out.println("울음 종료");

    }

    private static void soundMove(AbstractAnimal animal) {
        System.out.println("울음 시작");
        animal.move();
        System.out.println("울음 종료");

    }
}
