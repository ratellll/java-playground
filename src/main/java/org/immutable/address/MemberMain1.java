package org.immutable.address;

public class MemberMain1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 mem1 = new MemberV1("빈이", address);
        MemberV1 mem2 = new MemberV1("솔이", address);


        System.out.println("빈이 주소는 + " + mem1);
        System.out.println("솔이 주소는 + " + mem2);

        //주소변경해야함
        mem2.getAddress().setValue("부산");
        System.out.println("빈이 주소는 + " + mem1);
        System.out.println("솔이 주소는 + " + mem2); //같은 참조값으로 사이드이펙트발생
    }
}
