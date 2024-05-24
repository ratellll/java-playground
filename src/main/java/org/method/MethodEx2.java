package org.method;

public class MethodEx2 {
    public static void main(String[] args) {
        String msg = "Hello World (MK1)";
        message(10);
        message("반가워유 모두들", 5);

    }

    public static void message(String msg, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(msg);
        }
    }

    public static void message(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World(MK2)");
        }
    }
}
