package org.access.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;



    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void result() {
        System.out.println(" ====================");
        System.out.println("장바구니 내역 출력");

        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 = " + item.getName() + " | 합계 = " + item.getTotal());
        }
        System.out.println("전체 합계 = " + total());
    }

    private int total() {
        int totlaPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totlaPrice += item.getTotal();
        }
        return totlaPrice;
    }
}
