package org.poly.ex5;



public class InterMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Capybara capybara = new Capybara();

        animalCheck(dog);
        animalCheck(capybara);
        animalCheck(cat);
        animalCheck(cow);

    }

    public static void animalCheck(InterfaceAnimal animal) {
        System.out.println("-----동물 테스트--------");
        animal.name();
        animal.sound();
        animal.move();
        System.out.println("-----동물  테스트 끝-----");

    }

}
