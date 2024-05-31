package org.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    MemberConstruct(String name, int age) {
        this(name, age, 150);
    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 이름 = : "+ name + " | 생성자 나이 = : " +age + " | 생성자 성적 = :"+ grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
