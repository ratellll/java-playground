package org.oop;

public class MP {
    //속성과 기능을 하나의 캡슐처럼 합침 - 캡술화
    // 캡슐화는 보수가 굉장히 편함
    int volume;
    boolean isOn = false;

    void on() {
        if (isOn) {
            System.out.println("이미 뮤직 플레이어가 실행되어있습니다");
        }else {
            isOn = true;
            System.out.println("뮤직 플레이어가 실행 되었습니다");
        }

    }
    void off() {
        if (!isOn) {
            System.out.println("이미 뮤직 플레이어가 종료되어있습니다");
        }else {
            isOn = false;
            System.out.println("뮤직 플레이어가 종료 되었습니다");
        }

    }
    void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("음량이 증가되었습니다");
            System.out.println("현재 음량 = " +volume);
        }else {
            System.out.println("뮤직 플레이어를 먼저 실행해주십시오");

        }

    }
    void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("음량이 축소되었습니다");
            System.out.println("현재 음량 = " +volume);
        }else {
            System.out.println("뮤직 플레이어를 먼저 실행해주십시오");
        }

    }
    void showStatus() {
        System.out.println("-----현재 상태 ------");
        System.out.println("-----볼륨 = "+ volume+"------");
        if (isOn) {
            System.out.println("실행중");
        }else {
            System.out.println("실행중인 프로그램 X");
        }
    }

}
