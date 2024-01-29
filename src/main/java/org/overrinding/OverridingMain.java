package org.overrinding;

public class OverridingMain {
    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스참조
        Child cd = new Child();
        System.out.println("자식 -> 자식");
        System.out.println("value = " + cd.value);
        cd.method();

        //부모변수가 부모 인스턴스참조

        Parent pt = new Parent();
        System.out.println("부모 > 부모");
        System.out.println("value :" + pt.value);
        pt.method();


        //부모변수가 자식인스턴스 참조( 다형적)
        Parent poly = new Child();
        System.out.println("부모 > 자식");
        System.out.println("value :" + poly.value); //변수는 오버라이딩 x
        poly.method(); //오버라이딩 된 메서드가 우선권을가짐
    }
}
