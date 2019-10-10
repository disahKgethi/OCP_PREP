package com.modisa.classdesign.models.encapsulation.graphicshape;

public class Circles {
    void getArea() {
        Circle circle = new Circle();
        //call to public method area() within package:
        circle.area();
        //call fillColor() with default access within package:
        circle.fillColor();
    }
}
