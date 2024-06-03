package org.access.ex1;

public class MaxCountEx {
    public static void main(String[] args) {
        MaxCounter mc = new MaxCounter(4);

        mc.increment();
        mc.increment();
        mc.increment();
        mc.increment();
        mc.increment();

        mc.getCount();
    }
}
