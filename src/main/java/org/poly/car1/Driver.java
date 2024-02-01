package org.poly.car1;

public class Driver {

    private Car car;


    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 " + car);
        this.car = car;
    }


    public void driver() {
        System.out.println("운전을 시작합니다 ");
        car.startEngine();
        car.pressAccel();
        car.offEngine();
    }
}
