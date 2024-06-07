package org.poly.ex2;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal animal = new Animal();


        sountAnimal(dog);
        sountAnimal(cat);
        sountAnimal(cow);
    }

    private static void sountAnimal(Animal animal) {
        System.out.println("---테스트 시작 ---");
        animal.sound();
        System.out.println("---테스트 종료 ---");

    }
}
