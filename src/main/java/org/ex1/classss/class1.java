package org.ex1.classss;

public class class1 {
    public static void main(String[] args) {

        student("빈이", 29, 100);
        student("솔이", 28, 100);

    }

    public static void student(String name, int age, int grade) {
        System.out.println(" | 이름 : " + name + " | 나이 : " + age + " | 성적 : " +grade);
    }
}
