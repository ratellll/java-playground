package org.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //인스턴스 변수나 메서드에는 접근불가
        //instanceValue++;


        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;


        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("프라이빗 인스턴스 메소드");
        System.out.println(instanceValue);
    }

    private static void staticMethod() {
        System.out.println("프라이빗 스태틱 메소드");
        System.out.println(staticValue);
    }
}
