package org.immutable.change;

public class MutableMain {
    public static void main(String[] args) {

        MutableObj obj = new MutableObj(30);
        obj.add(10);

        System.out.println(obj.getValue());
    }
}
