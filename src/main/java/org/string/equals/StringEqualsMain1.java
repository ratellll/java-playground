package org.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String s = new String("hi");
        String s2 = new String("hi");

        System.out.println(s == s2);
        System.out.println(s.equals(s2));


        String s3 = "h1";
        String s4 = "h1";

        System.out.println(s3 == s4); //리터럴 사용시 String pool에 들어가기떄문에 같은값일경우 같은 참조를 바라봄
        System.out.println(s3.equals(s4));
    }
}
