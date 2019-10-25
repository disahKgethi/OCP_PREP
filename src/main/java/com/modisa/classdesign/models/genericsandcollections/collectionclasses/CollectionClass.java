package com.modisa.classdesign.models.genericsandcollections.collectionclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class CollectionClass {
    public void collClass() {
        TreeSet<String> stringArrayList = new TreeSet<>();

        stringArrayList.add("C");
        stringArrayList.add("C#");
        stringArrayList.add("C++");
        stringArrayList.add("C");
        stringArrayList.add("JAVA");
        stringArrayList.add("C");

        for (String language: stringArrayList) {
            System.out.println(language);
        }
    }
}
