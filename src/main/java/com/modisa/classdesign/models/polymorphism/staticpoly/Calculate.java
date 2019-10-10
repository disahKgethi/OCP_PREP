package com.modisa.classdesign.models.polymorphism.staticpoly;

public class Calculate {
    public double add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }
}
