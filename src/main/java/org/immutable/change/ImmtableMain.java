package org.immutable.change;

public class ImmtableMain {
    public static void main(String[] args) {

        ImmutableObj obj = new ImmutableObj(20);
        ImmutableObj obj1 = obj.add(50);

        System.out.println(obj.getValue());
        System.out.println(obj1.getValue());
    }
}
