package org.exception.basic.checked;

public class Main1 {
    public static void main(String[] args) {
        Service sevice = new Service();
        sevice.callClient();
        System.out.println("정상종료");
    }
}
