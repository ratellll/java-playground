package org.static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data2 = new Data2("a",counter);
        System.out.println("a ====" + data2.name + " 카운터 = " + counter.count);
        Data2 data3 = new Data2("b",counter);
        System.out.println("a ====" + data3.name + " 카운터 = " + counter.count);
        Data2 data4 = new Data2("c",counter);
        System.out.println("a ====" + data4.name + " 카운터 = " + counter.count);
    }
}
