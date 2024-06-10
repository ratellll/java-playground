package org.poly.ex6;


public class SoundFlyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        animalCheck(dog);
        animalCheck(bird);
        animalCheck(chicken);


        flyCheck(bird);
        flyCheck(chicken);
    }


    public static void animalCheck(AbstractAnimal animal) {
        System.out.println("-----동물 테스트--------");
        animal.sound();

        animal.move();
        System.out.println("-----동물  테스트 끝-----");

    }

    public static void flyCheck(Fly fly) {
        System.out.println("-----동물 테스트--------");
        fly.fly();
        System.out.println("-----동물  테스트 끝-----");
    }
}
