package org.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;


    public static void staticCall() {

        //인스턴스 변수 및 메서드에 접근 불가
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println(instanceValue);

    }
    private static void staticMethod() {
        System.out.println(staticValue);
    }
}
