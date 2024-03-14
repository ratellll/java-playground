package org.array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int [] mans; //배열 변수 선언
        mans = new int[5];

        //변수값 대입

        mans[0] = 90;
        mans[1] = 50;
        mans[2] = 40;
        mans[3] = 30;
        mans[4] = 20;

        for (int i = 0; i < 5; i++) {
            System.out.println("사람 " + (i + 1) + "점수" + mans[i]);
        }

        System.out.println("1번 점수 " + mans[0]);
        System.out.println("2번 점수 " + mans[1]);
        System.out.println("3번 점수 " + mans[2]);
        System.out.println("4번 점수 " + mans[3]);
        System.out.println("5번 점수 " + mans[4]);




    }
}
