package org.poly.ex5;

public class Capybara implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("........");
    }

    @Override
    public void move() {
        System.out.println("카후바후카후바후카후바후");
    }

    @Override
    public void name() {
        System.out.println("캅위");
    }
}
