package com.modisa.classdesign.models.classdesign.object.composition;

public class Circle {
    private Point center;
    private int radius;

    public Circle(int xPos, int yPos, int radius) {
        center = new Point(xPos, yPos);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
