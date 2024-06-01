package org.access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod () {
        System.out.println("퍼블릭 메서드");
    }

    void defaultMethod () {
        System.out.println("디폴트 메서드");
    }

    private void privateMethod () {
        System.out.println("프라이빗 메서드");
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        privateField = 100;
        defaultField = 200;
        publicField = 300;

       privateMethod();
        defaultMethod();
        publicMethod();
    }
}
