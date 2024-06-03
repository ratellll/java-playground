package org.static2.ex2;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
         int value= 0;
         for (int i : values) {
             value += i;
         }
         return value;
     }

    public static double avg(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int value = values[0];
        for (int i : values) {
            if (i < value) {
                value = i;
            }
        }
        return value;
    }

    public static int max(int[] values) {
        int value = values[0];
        for (int i : values) {
            if (i > value) {
                value = i;
            }
        }
        return value;
    }


}
