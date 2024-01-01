package org.oop;

public class Rectangle {
    int width;
    int height;



    int area () {
        return width * height;
    }

    int perimeter () {
        return 2* (width + height);
    }

    boolean isSquare ( ) {
        return width == height;
    }
}
