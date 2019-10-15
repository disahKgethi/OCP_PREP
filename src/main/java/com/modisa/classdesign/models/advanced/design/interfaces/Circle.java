package com.modisa.classdesign.models.advanced.design.interfaces;

public class Circle extends CircularShape {
    private int xPos, yPos, radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void roll(float degree) {
        System.out.printf("Rolling circle by %f degrees", degree);
    }
}
