package org.cond;

public class SwitchEx1 {
    public static void main(String[] args) {
        String grade = "Q";

        switch (grade) {
            case "A" :
                System.out.println("1짱맨");
                break;
            case "B" :
                System.out.println("2짱맨");
                break;
            case "C" :
                System.out.println("3짱맨");
                break;
            case "D" :
                System.out.println("4짱맨");
                break;
            case "F" :
                System.out.println("꼴짱맨");
                break;
            default:
                System.out.println("잘못된 학점입니다");
        }
    }
}
