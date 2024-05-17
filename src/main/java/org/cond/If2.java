package org.cond;

public class If2 {
    public static void main(String[] args) {

        int age = 2;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age<=13 ) {
            System.out.println("초딩");
        } else if (age<=16) {
            System.out.println("중딩");
        } else if (age<=19) {
            System.out.println("고딩");
        } else if (20<=age) {
            System.out.println("클럽ㄴ");
        }

    }
}
