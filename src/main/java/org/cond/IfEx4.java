package org.cond;

public class IfEx4 {
    public static void main(String[] args) {
        double rating = 8.3;

        if (rating <= 9) {
            System.out.println("어바웃타임 추천");
        }
        if (rating <=8){
            System.out.println("토이스토리 추천");
        }
        if (rating <=7) {
            System.out.println("고질라 추천");
        }
    }
}
