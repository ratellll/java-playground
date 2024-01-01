package org.oop;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle square = new Rectangle();
        square.height = 50;
        square.width = 50;

        int areaC = square.area();
        System.out.println("넓이는 : " + areaC);
        int perimeterC = square.perimeter();
        System.out.println("둘레는 : " + perimeterC);
        boolean squareC = square.isSquare();
        System.out.println("정사각형 여부 : " + squareC);

    }
}
