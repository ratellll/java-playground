package org.poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println(" K3에 시동을 킵니다 ");
    }

    @Override
    public void offEngine() {
        System.out.println(" K3에 시동을 끕니다 ");
    }

    @Override
    public void pressAccelerator() {
        System.out.println(" K3가 앞으로 갑니다 ");
    }
}
