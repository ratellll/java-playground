package org.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker sp = new Speaker(80);

        System.out.println("볼륨 2번 업");
        sp.volumeUp();
        sp.volumeUp();

        System.out.println("볼륨 11번 다운 , 경고메세지 확인 ");
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();
        sp.volumeDown();

        System.out.println("볼륨 11번 업, 경고메세지 확인");
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();

        System.out.println("볼륨 확인");
        sp.showVolume();
    }
}
