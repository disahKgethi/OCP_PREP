package com.modisa.classdesign.models.advanced.design.nestedclasses;

public class InnerNonLocal {
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

    private Point center;
    private int radius;

    public InnerNonLocal(int xPos, int yPos, int radius) {
        center = this.new Point(xPos, yPos);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "InnerNonLocal{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
