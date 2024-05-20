package org.cond;

public class IfEx3 {
    public static void main(String[] args) {
        int dollar = 0;

        if (dollar < 0) {
            System.out.println("잘못된금액입니다");
        } else if (dollar == 0) {
            System.out.println("환전금액x");
        }else {
            int won = dollar * 1300;
            System.out.println(won);
        }
    }
}
