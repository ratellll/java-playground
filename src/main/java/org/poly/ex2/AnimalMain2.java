package org.poly.ex2;

public class AnimalMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            System.out.println("---테스트 시작 ---");
            animal.sound();
            System.out.println("---테스트 종료 ---");
        }

    }

    private static void sountAnimal(Animal animal) {
        System.out.println("---테스트 시작 ---");
        animal.sound();
        System.out.println("---테스트 종료 ---");

    }
}
