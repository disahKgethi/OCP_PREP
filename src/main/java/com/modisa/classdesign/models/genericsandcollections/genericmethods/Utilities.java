package com.modisa.classdesign.models.genericsandcollections.genericmethods;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }

    public void testFill() {
        List<Integer> integerList = new ArrayList<Integer>();

        integerList.add(10);
        integerList.add(20);

        System.out.println("The Original list is: " + integerList);
        fill(integerList, 1000);
        System.out.println("The list after calling Utility.fill() is: " + integerList);
    }
}
