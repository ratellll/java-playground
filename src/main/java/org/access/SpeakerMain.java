package org.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(50);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();


        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정"); speaker.volume = 200;
        speaker.showVolume();
    }
}
