package org.object.equals;

public class UserMain1 {
    public static void main(String[] args) {

        UserV1 userV1 = new UserV1("user1");
        UserV1 userV2= new UserV1("user2");


        System.out.println("identity = " + (userV1 == userV2));
        System.out.println("equality = " + (userV1.equals(userV2)));

    }
}
