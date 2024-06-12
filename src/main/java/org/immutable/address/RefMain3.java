package org.immutable.address;

public class RefMain3 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 공유


        System.out.println("A = " +a);
        System.out.println("B = " +b);

        b = new ImmutableAddress("부산");

        System.out.println("A = " +a);
        System.out.println("B = " +b);

    }
}
