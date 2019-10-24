package com.modisa.classdesign.models.genericsandcollections.mapinterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public void navigateMapTest() {
        NavigableMap<Integer, String> score = new TreeMap<>();
        score.put(65,"Maths");
        score.put(85,"Physics");
        score.put(56,"Biology");
        score.put(92,"Setswana");
        score.put(53,"Afrikaans");

        System.out.println("The data in the map is: " + score);
        System.out.println("The data descending order is: " + score.descendingMap());
        System.out.println("Details of the distinctions are: " + score.tailMap(85));
        System.out.println("The Lowest mark is : " + score.firstEntry());
        System.out.println("The highest mark is: " + score.lastEntry());
    }
}
