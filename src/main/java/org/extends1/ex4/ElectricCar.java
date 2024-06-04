package org.extends1.ex4;

public class ElectricCar extends Car {


    public void charge() {
        System.out.println("충전합니다");
    }

    @Override
    public void move() {
        System.out.println("전기차가 출발합니다");
    }
}
