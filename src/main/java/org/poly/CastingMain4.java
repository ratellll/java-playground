package org.poly;

public class CastingMain4 {
    public static void main(String[] args) {

        Parent pt1 = new Child();
        Child cd1 = (Child) pt1;
        cd1.childMethod();

        Parent pt2 = new Parent();
        Child cd2 = (Child) pt2;
        cd2.childMethod();
    }
}
