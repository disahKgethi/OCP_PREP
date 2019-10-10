package com.modisa.classdesign.models.inheritance;

public class TestNumber {
    // Take array of numbers and sum them up
    public static double sum(Number[] numbs) {
        double sum = 0d;

        for (Number num: numbs) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
