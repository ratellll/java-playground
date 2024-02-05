package org.esay;

public class ExMain3 {
    public static void main(String[] args) {

        int balnce = 10000;
       balnce= inputM(balnce, 30000);
        balnce=outputM(balnce, 25000);
    }

    public static int inputM(int b, int m) {
         b += m;
        System.out.println(b);
        return b;
    }

    public static int outputM(int b, int m) {
        if (b >= m) {
            b -= m;
            System.out.println(b);
        } else {
            System.out.println("실패");
            return b;
        }
        return b;
    }
}
