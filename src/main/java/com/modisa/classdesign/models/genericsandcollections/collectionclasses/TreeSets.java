package com.modisa.classdesign.models.genericsandcollections.collectionclasses;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public void treeSet() {
        String pagan = "the quick brown fox jumps over the lazy dog";

        Set<Character> characters = new TreeSet<>();

        for (char myChar: pagan.toCharArray())
            characters.add(myChar);
        System.out.println("Sorted words: " + pagan);
    }
}
