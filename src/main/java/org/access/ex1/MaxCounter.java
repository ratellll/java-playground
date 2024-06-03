package org.access.ex1;

public class MaxCounter {
    private int count = 0;

    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }


   public void increment() {
        //검증로직
       if (count >= max) {
           System.out.println("최대값은 넘을 수 없습니다 .  최대값 = " + max);
           return;
       }
       //실행로직
       count++;
        //        if (count < max) {
//            count++;
//            System.out.println("현재 카운트 = " + count);
//        }else {
//            System.out.println("최대값은 넘을 수 없습니다 .  최대값 = " + max);
//        }

    }

    public int getCount() {
        System.out.println("카운트 = " + count);
        return count;
    }


}
