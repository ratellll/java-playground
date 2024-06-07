package org.poly.ex2;

public class AnimalMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            soundCheck(animal);
        }

    }

    private static void soundCheck(Animal animal) {
        System.out.println("---테스트 시작 ---");
        animal.sound();
        System.out.println("---테스트 종료 ---");
    }

}
