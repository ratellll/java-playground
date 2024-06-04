package org.extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();
        HydrogenCar hc = new HydrogenCar();

        ec.Move();
        gc.Move();
        hc.charge();

        ec.openDoor();

    }
}
