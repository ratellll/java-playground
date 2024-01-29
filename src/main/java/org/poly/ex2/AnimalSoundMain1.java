package org.poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();


        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 시작");
        animal.sound();
        System.out.println("동물소리 종료");
    }
}
