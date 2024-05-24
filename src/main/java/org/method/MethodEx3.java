package org.method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
       balance =  deposit(balance, 30000);
        balance = withdraw(balance, 40000);
        balance = withdraw(balance, 10000);
        // 반환값이 있을경우 객체에 꼭넣어주어야한다
    }

    public static int deposit(int balance,int m) {
        balance += m;
        System.out.println("1번입금액  : " + m +  "   잔액 : " +balance);
        return balance  ;
        }
        public static int withdraw(int balance,int m) {
        if (balance >= m) {
            balance -= m;
            System.out.println("출금 금액 : " + m + "... 현재 잔액: " + balance);
        }else{
           System.out.println("잔액부족");
        }
        return balance;

    }
}
