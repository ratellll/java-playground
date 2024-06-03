package org.access.ex2;

public class ItemMain1 {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();

        Item item = new Item("감자", 5000, 3);
        Item item2 = new Item("고기", 10000, 5);
        Item item3 = new Item("대파", 3000, 2);

        sc.addItem(item);
        sc.addItem(item2);
        sc.addItem(item3);

        sc.result();

    }
}
