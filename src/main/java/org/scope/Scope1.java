package org.scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // 생존
        if (true) {
            int x = 20; //생존
            System.out.println("if m = " + m);
            System.out.println("if x = " + x );
        } // x 다이
        //System.out.println(x); // x가 죽었기때문 존재 x
    }
}
