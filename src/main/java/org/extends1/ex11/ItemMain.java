package org.extends1.ex11;

public class ItemMain {
    public static void main(String[] args) {
        Book book = new Book("자바", 15000, "김영한", 3355);
        Album album = new Album("blue print", 20000, "JAY-Z");
        Movie movie = new Movie("8Mile", 10000, "EMINEM", "EMINEM");

        book.print();
        album.print();
        movie.print();
    }


//    public int sum(Item item) {
//        int sum = 0;
//        item.getPrice();
//
//    }
}
