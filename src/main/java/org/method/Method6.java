package org.method;

public class Method6 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1번"+num1);
        num1=changeNumber(num1); // 반환값을 담는 객체를 설정해줘야함
        System.out.println("4번"+num1);

    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }

}
