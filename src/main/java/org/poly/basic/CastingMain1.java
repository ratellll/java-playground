package org.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();


        //다운캐스팅 ( 부모 - > 자식)
        Child child = (Child) poly;
        child.childMethod();

    }
}
