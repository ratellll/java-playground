package org.static2.ex1;

public class Car {
    private String name;

    private static int count;


    public Car(String name) {
        System.out.println("차랑 구입  ||  차량 이름 : " + name);
        this.name = name;
        count++;

    }

    public static void showTotalCars() {
        System.out.println(count);
    }
}
