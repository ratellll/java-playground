package org.oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        add(data);
        add(data);
        add(data); // 참조값을 넘기기때문에 위에 data로 변수 생성을 했던곳에 수정이가능함

    }

    static void add(ValueData data) {
        data.value++;
        System.out.println(data.value);
    }
}
