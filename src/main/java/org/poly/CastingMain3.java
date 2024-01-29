package org.poly;

public class CastingMain3 {
    public static void main(String[] args) {

        Child cd = new Child();
        Parent pt = (Parent) cd; // 업캐스팅은 생략가능, 생략권장
        Parent pt2 = cd; //업캐스팅생략

        pt.paranetMethod();
        pt2.paranetMethod();

    }
}
