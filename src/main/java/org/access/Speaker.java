package org.access;

public class Speaker {
     private int volume = 50;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할수없습니다 , 최대 음량입니다");
        }else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
            System.out.println("현재 음량 = " + volume);
        }
    }

    void volumeDown(){
        if (volume == 0) {
            System.out.println("볼륨이 0 입니다. 최저 음량입니다.");
        }else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다");
            System.out.println("현재 음량 = " + volume);
        }
    }

    void showVolume() {
        System.out.println("현재 음량 = " + volume);
    }
}
