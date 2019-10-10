package com.modisa.classdesign.models.constructor.overloading;

public class Calculator {
    private double a;
    private double b;
    private double c;

    public Calculator(){

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public  Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
