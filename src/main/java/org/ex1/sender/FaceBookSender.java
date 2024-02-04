package org.ex1.sender;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String messege) {
        System.out.println("페메를 발송합니다" + messege);
    }
}
