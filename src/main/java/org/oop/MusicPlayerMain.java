package org.oop;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();
    }
}
