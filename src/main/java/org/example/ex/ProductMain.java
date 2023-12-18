package org.example.ex;

public class ProductMain {
    public static void main(String[] args) {

        Product[] products = new Product[3];

        Product dooBoo = new Product();
        dooBoo.productName = "두부";
        dooBoo.price = 1500;
        dooBoo.quantity = 10;
        dooBoo = products[0];

        Product kimchi = new Product();
        kimchi.productName = "김치";
        kimchi.price = 10000;
        kimchi.quantity = 20;
        kimchi = products[1];

        Product coke = new Product();
        coke.productName = "콜라";
        coke.price = 2000;
        coke.quantity = 30;
        kimchi = products[2];


        for (Product product : products) {
            System.out.println("상품이름 : "+ product.productName);
            System.out.println("상품가격 : "+ product.price);
            System.out.println("상품수량 : "+ product.quantity);

        }
    }
}
