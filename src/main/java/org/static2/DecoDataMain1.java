package org.static2;

public class DecoDataMain1 {
    public static void main(String[] args) {

        System.out.println("1.정적 호출");
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출");
        DecoData data = new DecoData();
        data.instanceCall();
    }
}
