package org.example.javanolyee;

public class Person {

    String name;
    int age;


    public Person() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("내 이름은 " + name);
         }

}
