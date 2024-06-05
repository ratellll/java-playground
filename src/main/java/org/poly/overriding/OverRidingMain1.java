package org.poly.overriding;

public class OverRidingMain1 {
    public static void main(String[] args) {
        //자식변수가 자식인스턴스참조
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println("=======================");
        //부모 변수가 부모 인스턴스참조
        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        System.out.println("=======================");
        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 x
        poly.method(); // 메서드는 오버라이당 O
    }
}
