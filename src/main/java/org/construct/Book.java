package org.construct;

public class Book {
    String BookName;
    String author;

    int page;

    Book(String BookName, String author) {
        this(BookName, author,200);
    }
    Book(String BookName, String author, int page){
        this.BookName = BookName;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println(BookName+author+page);
    }

}
