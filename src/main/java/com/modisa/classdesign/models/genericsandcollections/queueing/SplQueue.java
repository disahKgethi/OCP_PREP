package com.modisa.classdesign.models.genericsandcollections.queueing;

import java.util.ArrayDeque;
import java.util.Deque;

public class SplQueue {
    private Deque<String> splQ = new ArrayDeque<>();
    void addInQueue(String customer) {
        splQ.addLast(customer);
    }

    void removeFront() {
        splQ.removeFirst();
    }

    void removeBack() {
        splQ.removeLast();
    }

    void printQueue() {
        System.out.println("Special queue contains: " + splQ);
    }

    public void testHere() {
        addInQueue("Mokgethi");
        addInQueue("Ngubane");
        addInQueue("Myeni");
        addInQueue("Ntsenyeko");

        printQueue();
        removeFront();
        removeBack();
        printQueue();
    }
}
