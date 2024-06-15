package org.immutable.change;

public class ImmtableMain2 {
    public static void main(String[] args) {

        ImmutableObj obj = new ImmutableObj(20);
         obj.add(50);

        System.out.println(obj.getValue());
    }
}
