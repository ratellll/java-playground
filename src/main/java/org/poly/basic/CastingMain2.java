package org.poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {

        Parent parent = new Parent();
        call(parent);
        Parent parent2 = new Child();
        call(parent2);


    }

    private static void call(Parent parent) {
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스가 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
