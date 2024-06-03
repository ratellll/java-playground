package org.static2.ex1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("테슬라");
        Car car2 = new Car("지프");
        Car car3 = new Car("GMC");
        Car car4 = new Car("완트럭");

        Car.showTotalCars();
    }
}
