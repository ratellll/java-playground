package org.exception.basic.checked;

public class MainCheck1 {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상종료");
    }
}
