package org.poly;

public class CastingMain1 {
    public static void main(String[] args) {

        Parent poly = new Child(); // x001
        //자식 기능 사용x
        //poly.childMethod();

        //다운캐스팅 (부모 > 자식)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();

    }
}
