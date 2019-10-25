package com.modisa.classdesign.models.genericsandcollections.rawtype;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest2 {
    public void testRaw() {
        List<String> list = new LinkedList();

        list.add("First Test from Raw Test2");
        list.add("Second Test from Raw Test2");

        List stringList = list;
        stringList.add(10);
        for (Iterator<String> stringIterator = stringList.iterator(); stringIterator.hasNext();)
            System.out.println("Item: " + stringIterator.next());
    }

    public void testRaw2() {
        List<String> list = new LinkedList();

        list.add("First Test from testRaw of Raw Test2");
        list.add("Second Test from testRaw2 of Raw Test2");

        List stringList = list;
        stringList.add(10);
    }
}
