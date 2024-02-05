package org.esay;

public class ExMain2 {
    public static void main(String[] args) {

        String ms = " 빈이 자바 놀이";
        printMs(ms,30);
    }

    public static void printMs(String ms,int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(ms);
        }
    }
}
