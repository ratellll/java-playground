package org.construct;

public class MemberInitMain {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.name = "빈";
        member1.age = 30;
        member1.grade = 1;

        MemberInit member2 = new MemberInit();

        member2.name = "솔";
        member2.age = 29;
        member2.grade = 2;

        MemberInit[] members = {member1, member2};


        for (MemberInit s : members) {
            System.out.println("이름" + s.name + "나이" + s.age + "성적" + s.grade);

        }

    }


}
