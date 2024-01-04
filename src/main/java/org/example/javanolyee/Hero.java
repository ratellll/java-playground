package org.example.javanolyee;

public class Hero extends Character {

    public Hero(String name ) {
            setName(name);
    }
    private Boolean superPower;

    public Boolean getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Boolean superPower) {
        this.superPower = superPower;
    }
    @Override
    public void attack(Hero hero) {
        System.out.println(this.getName() + "다이다이"+ hero.getName());

    }
}
