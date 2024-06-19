package org.exception.basic.checked;

public class Main1 {
    public static void main(String[] args) {
        Sevice sevice = new Sevice();
        sevice.callClient();
        System.out.println("정상종료");
    }
}
