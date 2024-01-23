package org.extends1.orverriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차가 움직입니다");
    }
    public void charge() {
        System.out.println("배터리를 충전합니다");
    }
}
