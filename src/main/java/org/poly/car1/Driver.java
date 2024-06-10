package org.poly.car1;

public class Driver {

    private Car car;


    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다"+ car);
        this.car = car;
    }


    public void start() {
        System.out.println("------자동차 테스트 시작------");
        car.startEngine();
        car.offEngine();
        car.pressAccelerator();
        System.out.println("------자동차 테스트 끝------");
    }
}
