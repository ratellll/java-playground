package org.access.ex;

public class MaxCountMain {
    public static void main(String[] args) {
        MaxCount maxCount = new MaxCount(5);
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        int count = maxCount.getCount();
        System.out.println(count);

    }
}
