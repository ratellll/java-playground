package org.oop;

public class MPMain {
    public static void main(String[] args) {
        MP mp = new MP();
        mp.on();
        System.out.println("--------------실행 , 종료------------");
        mp.off();
        mp.off();
        System.out.println("--------------종료두번------------");
        mp.on();
        System.out.println("--------------다시켜고------------");
        mp.volumeUp();
        mp.volumeUp();
        System.out.println("-------------볼륨올리고-------------");
        mp.off();
        mp.volumeUp();
        System.out.println("--------------종료하고 볼륨올리고------------");
        mp.on();
        mp.volumeUp();
        mp.volumeUp();
        System.out.println("-------------다시 키고 올리고-------------");
        mp.volumeDown();
        mp.volumeDown();
        System.out.println("--------------------------");
        mp.showStatus();
        System.out.println("--------------------------");
        mp.off();
    }
}
