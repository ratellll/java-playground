package org.esay;

public class MainNori {
    public static void main(String[] args) {


        int sum1 = sum(20, 30);
        System.out.println(sum1);

        int sum2 = sum(44520, 3230);
        System.out.println(sum2);
    }


    public static int sum(int a, int b) {
        int sum = a+ b;
        return sum;
    }
}
