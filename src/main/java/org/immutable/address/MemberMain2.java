package org.immutable.address;

public class MemberMain2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 mem1 = new MemberV2("빈이", address);
        MemberV2 mem2 = new MemberV2("솔이", address);


        System.out.println("빈이 주소는 + " + mem1);
        System.out.println("솔이 주소는 + " + mem2);

        //주소변경해야함
        mem2.setAddress(new ImmutableAddress("부산"));
        System.out.println("빈이 주소는 + " + mem1);
        System.out.println("솔이 주소는 + " + mem2);
    }
}
