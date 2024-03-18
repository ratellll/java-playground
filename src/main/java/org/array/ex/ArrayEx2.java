package org.array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];

        System.out.println("5개의 정수를 입력하시오");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        for (int j : number) {
            System.out.print(j + " ");
        }

    }
}
