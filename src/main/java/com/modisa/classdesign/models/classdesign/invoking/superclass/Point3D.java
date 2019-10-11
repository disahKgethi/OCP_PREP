package com.modisa.classdesign.models.classdesign.invoking.superclass;

public class Point3D extends Point2D {
    private int zPos;

    public Point3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + zPos;
    }
}
