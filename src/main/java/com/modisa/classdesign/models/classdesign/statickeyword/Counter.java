package com.modisa.classdesign.models.classdesign.statickeyword;

public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public void printCount() {
        System.out.println("Number of instances created so far is: " + count);
    }
}
