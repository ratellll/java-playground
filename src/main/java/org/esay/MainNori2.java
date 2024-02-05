package org.esay;

public class MainNori2 {
    public static void main(String[] args) {

    int num1 = 5;
        System.out.println("num 1 : "+num1);
        num1 = chnum(num1);
        System.out.println("num 1 : after" + num1);
    }


    public static int chnum(int num1) {
        num1 = num1* 2;
        return num1;
    }
}
