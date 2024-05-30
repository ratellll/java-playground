package org.construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit mI1 = new MemberInit();
        MemberInit mI2 = new MemberInit();

      mI1.initMember(mI1,"빈이",29,275);
        mI2.initMember(mI2,"솔이",28,245);

        MemberInit[] mems = {mI1, mI2};
        for (MemberInit mem : mems) {
            System.out.println("이름 = " + mem.name + " | 나이 = " + mem.age + " | 사이즈 = " + mem.size);
        }


    }


}
