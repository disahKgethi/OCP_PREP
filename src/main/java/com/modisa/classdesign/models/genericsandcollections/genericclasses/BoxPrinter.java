package com.modisa.classdesign.models.genericsandcollections.genericclasses;

public class BoxPrinter<T> {
    private T val;
    public BoxPrinter(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return ("[" + val + "]");
    }
}
