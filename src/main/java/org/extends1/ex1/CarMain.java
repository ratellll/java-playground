package org.extends1.ex1;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();
        ec.move();
        ec.charge();

        GasCar gc = new GasCar();
        gc.fillUp();
        gc.move();
    }
}
