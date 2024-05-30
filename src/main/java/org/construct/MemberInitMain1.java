package org.construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit mI1 = new MemberInit();
        MemberInit mI2 = new MemberInit();

        mI1.name = "빈";
        mI1.age = 29;
        mI1.size = 275;

        mI2.name = "솔";
        mI2.age = 28;
        mI2.size = 245;

        MemberInit[] mems = {mI1, mI2};
        for (MemberInit mem : mems) {
            System.out.println("이름 = " + mem.name + " | 나이 = " + mem.age + " | 사이즈 = " + mem.size);
        }


    }
}
