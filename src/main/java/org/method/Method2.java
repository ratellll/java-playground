package org.method;

public class Method2 {
    public static void main(String[] args) {

        // 반환타입이 없기때문에 String안에 넣어줄수없음 String header = printHeader();
        printHeader();
        int binSolage = add(29, 29);
        System.out.println(binSolage);
        printFooter();
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // 반환타입을 맞춰야함
    }
    // 제어자   반환타입 메서드이름(매개변수 목록){
    //메서드 본문
//      }

    public static void printHeader() {
        System.out.println("= 프로그램 헤더");
    }
    public static void printFooter() {
        System.out.println("= 프로그램 푸터");
    }
}
