package org.poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();


        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");
        System.out.println("동물소리 테스트 시작");
        caw.sound();
        System.out.println("동물소리 테스트 종료");
        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void sound(Caw caw) {
        System.out.println("동물소리 테스트 시작");
        caw.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
