package org.extends1.ex1;

public class CarMain1 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();

        ec.move();
        gc.move();

    }
}
