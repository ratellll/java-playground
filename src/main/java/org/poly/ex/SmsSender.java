package org.poly.ex;

public class SmsSender implements Sender{
    @Override
    public void SendMessage(String message) {
        System.out.println("SMS를 발송합니다 !" + message);
    }


}
