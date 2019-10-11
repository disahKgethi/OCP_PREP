package com.modisa.classdesign.models.classdesign.encapsulation.appcanvas;

import com.modisa.classdesign.models.classdesign.encapsulation.graphicshape.Circle;

public class Canvas {
    void getArea() {
        Circle circle = new Circle();
        circle.area(); //call to public method area(), outside package
    }
}
