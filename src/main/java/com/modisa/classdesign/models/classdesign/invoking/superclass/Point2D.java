package com.modisa.classdesign.models.classdesign.invoking.superclass;

public class Point2D {
    private int xPos, yPos;
    public Point2D(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "x=" + xPos + ", y=" + yPos;
    }
}
