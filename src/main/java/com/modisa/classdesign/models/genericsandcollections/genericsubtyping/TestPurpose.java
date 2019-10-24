package com.modisa.classdesign.models.genericsandcollections.genericsubtyping;

import java.util.ArrayList;
import java.util.List;

public class TestPurpose {
    public void testHere(List<?> list) {
        for (Object element: list)
            System.out.println("[" + element + "]");
    }

    public void fillList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        testHere(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("Generics");
        stringList.add("Subtyping");
        testHere(stringList);
    }
}
