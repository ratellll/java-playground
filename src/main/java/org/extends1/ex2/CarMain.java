package org.extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();

        ec.Move();
        gc.Move();
    }
}
