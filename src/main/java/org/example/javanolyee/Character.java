package org.example.javanolyee;

public abstract class Character extends Person{
    public abstract void attack(Hero hero); //내용이없으면 추상메소드 (오버라이드를통해서)
}

interface ICharacter{
    void attack(Hero hero);

}
