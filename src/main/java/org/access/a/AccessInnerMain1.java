package org.access.a;

public class AccessInnerMain1 {
    public static void main(String[] args) {

        AccessData ad = new AccessData();

        //public 호출 가능
        ad.publicField = 1;
        ad.publicMethod();

        //같은패키지 default 호출가능
        ad.defaultField = 2;
        ad.defaultMethod();

        //프라이빗은 호출 x

        ad.innerAccess();
    }
}
