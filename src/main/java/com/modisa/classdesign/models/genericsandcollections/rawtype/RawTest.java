package com.modisa.classdesign.models.genericsandcollections.rawtype;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest {
    public void myTest() {
        List list = new LinkedList();

        list.add("First Test");
        list.add("Second Test");
        List<String> stringList = list;

        for (Iterator<String> itrString = stringList.iterator(); itrString.hasNext();)
             System.out.println("Item: " + itrString.next());
    }

    public void myTest2() {
        List<String> stringList = new LinkedList<>();
        stringList.add("First Test from Test 2");
        stringList.add("Second Test from Test 2");
        List list = stringList;
        for (Iterator<String> stringIterator = list.iterator(); stringIterator.hasNext();)
            System.out.println("Item: " + stringIterator.next());
    }
}
