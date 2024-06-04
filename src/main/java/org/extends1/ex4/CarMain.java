package org.extends1.ex4;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();
        HydrogenCar hc = new HydrogenCar();

        ec.move();
        gc.move();
        hc.charge();

        ec.openDoor();

    }
}
