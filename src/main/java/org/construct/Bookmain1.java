package org.construct;

public class Bookmain1 {
    public static void main(String[] args) {

        Book book1 = new Book("빈이", "솔이");
        Book book2 = new Book("솔빈이", "뚠이",500);

        book1.displayInfo();
        book2.displayInfo();
    }
}
