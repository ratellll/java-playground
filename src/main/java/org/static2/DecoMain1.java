package org.static2;

public class DecoMain1 {
    public static void main(String[] args) {

        String a = "hello java";
        DecoUtil1 util1 = new DecoUtil1();
        String deco = util1.deco(a);

        System.out.println(a);
        System.out.println(deco);
    }
}
