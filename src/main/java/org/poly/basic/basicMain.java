package org.poly.basic;

public class basicMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.parentMethod();

        child.childMethod();

        Parent poly = new Child();
        poly.parentMethod();
    }
}
