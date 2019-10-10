package com.modisa.classdesign.models.polymorphism.dynamicpoly;

public class Square extends Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public double area() {
        return (side * side);
    }
}
