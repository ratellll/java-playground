package org.exception.basic.ex2;



import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {

        NetworkServiceV2_1 networkServiceV1 = new NetworkServiceV2_1();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" 전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkServiceV1.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정지합니다");

    }
}
