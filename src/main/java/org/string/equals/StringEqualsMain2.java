package org.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {

        String s = new String("hi");
        String s2 = new String("hi");
        System.out.println(isSame(s, s2));

        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(isSame(s3,s4));
    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
