package com.modisa.classdesign.models.classdesign.object.composition;

public class Point {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
