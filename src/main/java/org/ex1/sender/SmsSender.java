package org.ex1.sender;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String messege) {
        System.out.println("문자를 발송합니다"+ messege);
    }
}
