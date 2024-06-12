package org.immutable.address;

public class RefMain1 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a; // 참조값 공유


        System.out.println("A = " +a);
        System.out.println("B = " +b);

        b.setValue("부산");

        System.out.println("A = " +a);
        System.out.println("B = " +b);

    }
}
