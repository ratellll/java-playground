package org.example;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(); // p1은 null
        Person p2 = new Person(); // p1은 null

        p1.name = "빈이";
        p2.name = "솔이";
        p1.address = "서울";
        p2.address = "강남";
        p1.isVip = true;
        p2.isVip = false;
        p1.age = 29;
        p2.age = 30;
        p1.money = 1000000;
        p2.money = 2000000;
        p1.size = 100;
        p2.size = 200;

        System.out.println("--------------------------");
        System.out.println(p1.name); // null
        System.out.println(p1.address); // null
        System.out.println(p1.isVip); // null
        System.out.println(p1.age); // null
        System.out.println(p1.money); // null
        System.out.println(p1.size);

        System.out.println("--------------------------");
        System.out.println(p2.name); // null
        System.out.println(p2.address); // null
        System.out.println(p2.isVip); // null
        System.out.println(p2.age); // null
        System.out.println(p2.money); // null
        System.out.println(p2.size);
    }
}
