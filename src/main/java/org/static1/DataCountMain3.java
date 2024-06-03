package org.static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data3 = new Data3("빈이");
        System.out.println(Data3.count);
        System.out.println(data3.count); // 인스턴스를 통해 접근이 가능하지만 가독성을위해 클래스를통해 접근해야함
    }
}
