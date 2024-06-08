package org.poly.ex4;

public class AbMain1 {
    public static void main(String[] args) {

        //추상클래스는 생성 불가

        Dog dog = new Dog("댕댕이");
        Cat cat = new Cat("냐옹이");
        Cow cow = new Cow("음머맨");

        soundCheck(dog);
        soundCheck(cat);
        soundCheck(cow);
    }

    public static void soundCheck(AbstractAnimal animal) {
        System.out.println("-----동물 테스트--------");
        animal.name();
        animal.sound();
        animal.move();
        System.out.println("-----동물  테스트 끝-----");

    }
}
