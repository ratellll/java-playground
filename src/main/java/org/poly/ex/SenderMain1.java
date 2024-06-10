package org.poly.ex;

public class SenderMain1 {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new FaceBookSender(), new SmsSender()};
        for (Sender sender : senders) {
            sender.SendMessage("반가워요");
        }
    }
}
