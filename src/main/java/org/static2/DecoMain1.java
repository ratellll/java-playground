package org.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hi!!";
        DecoUtill1 decoUtill1 = new DecoUtill1();
        String deco = decoUtill1.deco(s);
        System.out.println(s);
        System.out.println(deco);

        String s1 = DecoUtil2.deco("hi");

        System.out.println(s1);
    }
}
