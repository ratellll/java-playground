package org.oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악을 시작합니다");

        volume++;
        System.out.println("현재 볼륨 : " + volume);
        volume++;
        System.out.println("현재 볼륨 : " + volume);

        volume--;
        System.out.println("현재 볼륨 : " + volume);

        System.out.println("음악 상태 확인");
        if (isOn) {
            System.out.println("음악 상태 : 실행중");
        }
        System.out.println("음악 상태 : 꺼져있음 " );

        isOn = false;
        System.out.println("음악 을 종료합니다");
    }
}
