package org.static2.ex2;

public class MathArrayUtils {

    private MathArrayUtils() {

    }
    public static int sum(int [] values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
            }
    public static double average(int [] values){
        return (double) sum(values) / values.length;
    }
    public static int min(int [] values){
        int minvalues = values[0];
        for (int value : values) {
            if (value < minvalues) {
                minvalues = value;
            }
        }
        return minvalues;
    }
    public static int max(int [] values){
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            } }
        return maxValue;
    }
    }

