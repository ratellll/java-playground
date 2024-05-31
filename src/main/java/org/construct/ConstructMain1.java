package org.construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct mem1 = new MemberConstruct("빈이", 29, 120);
        MemberConstruct mem2 = new MemberConstruct("솔이", 28, 150);

        MemberConstruct[] mems = {mem1, mem2};

        for (MemberConstruct mem : mems) {
            System.out.println("이름 = " + mem.name + " | 나이 = " + mem.age + " | 사이즈 = " + mem.grade);
        }
    }
}
