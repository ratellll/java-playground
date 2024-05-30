package org.construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit mI1 = new MemberInit();
        MemberInit mI2 = new MemberInit();

        initMember(mI1,"빈이",29,275);
        initMember(mI2,"솔이",28,245);

        MemberInit[] mems = {mI1, mI2};
        for (MemberInit mem : mems) {
            System.out.println("이름 = " + mem.name + " | 나이 = " + mem.age + " | 사이즈 = " + mem.size);
        }


    }

    static void initMember(MemberInit member, String name, int age, int size) {
        member.name = name;
        member.age = age;
        member.size = size;
    }
}
