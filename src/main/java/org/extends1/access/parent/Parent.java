package org.extends1.access.parent;

public class Parent {
    public int publicInt;
    protected int proInt;
    int defaultInt;

    private int privateInt;


    public void publicMethod() {
        System.out.println("public Method");
    }

    protected void protectedMethod() {
        System.out.println("protected Method");
    }

      void defaultMethod() {
        System.out.println(" default Method");
    }

    private void privateMethod() {
        System.out.println("private Method");
    }

    public void printParent() {
        System.out.println("====Parent Method 안 ====");
        System.out.println("publicValue = " + publicInt);
        System.out.println("protectedValue = " + proInt);
        System.out.println("defaultValue = " + defaultInt);
        System.out.println("privateInt = " + privateInt);

        //부모 메서드안에서 모두 접근가능
        defaultMethod();
        privateMethod();
    }
}
