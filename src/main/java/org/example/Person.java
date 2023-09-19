package org.example;

public class Person {

    String name;
    String address;
    boolean isVip;
    int age;
    int money;
    int size;
    static int count = 0;

    public void printName() {
        System.out.println("내 이름은 " + name);
         }
    public static void printCount() {
        System.out.println("count = " + count);
    }
}
