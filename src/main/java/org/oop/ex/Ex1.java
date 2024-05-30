package org.oop.ex;

public class Ex1 {
    public static void main(String[] args) {
        Rectangle rT = new Rectangle();
        rT.width = 20;
        rT.height = 50;

        int area = rT.calculateArea();
        System.out.println(area);
        int perimeter = rT.calculatePerimeter();
        System.out.println(perimeter);
        boolean square = rT.isSquare();
        System.out.println(square);
    }
}
