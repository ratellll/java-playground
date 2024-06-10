package org.poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println(" Model3에 시동을 킵니다 ");
    }

    @Override
    public void offEngine() {
        System.out.println(" Model3에 시동을 끕니다 ");
    }

    @Override
    public void pressAccelerator() {
        System.out.println(" Model3가 앞으로 갑니다 ");
    }
}
