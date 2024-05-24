package org.method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("--------------------------------");
            System.out.println("선택: ");

            int choice = scanner.nextInt();
            int amount;
            switch (choice){
                case 1:
                    System.out.println("입금 금액을 적어주세요 :");
                    amount = scanner.nextInt();
                   balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.println("출금 금액을 적어주세요 :");
                    amount = scanner.nextInt();
                    balance =withdraw(balance, amount);
                        break;
                case 3:
                    System.out.println("현재 잔액 : " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다");
                    return; // break 걸면 while문으로 다시들어감
                default:
                    System.out.println("올바른 메뉴가 아닙니다. 다시 선택해주세요");
            }
        }

    }

    public static int deposit(int balance,int m) {
        balance += m;
        System.out.println("입금금액 : "+ m + " | 현재 잔액 :" + balance);
        System.out.println("---------------------");
        return balance  ;
    }
    public static int withdraw(int balance,int m) {
        if (balance >= m) {
            balance -= m;
            System.out.println("출금금액 : "+ m + " | 현재 잔액 :" + balance);
        }else {
            System.out.println("잔액이 부족합니다.   | 현재 잔액 :" + balance);
        }
        return balance;
    }
}
