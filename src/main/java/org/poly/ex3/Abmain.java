package org.poly.ex3;



public class Abmain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();


        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("울음 시작");
        animal.sound();
        System.out.println("울음 종료");

    }

}
