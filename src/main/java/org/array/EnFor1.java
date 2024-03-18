package org.array;

public class EnFor1 {
    public static void main(String[] args) {
        int[]numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number);
        }

                    //향상된 for문은 오른쪽에 배열을 넣는다
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
