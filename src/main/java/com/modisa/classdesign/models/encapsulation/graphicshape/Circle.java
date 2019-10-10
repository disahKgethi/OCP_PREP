package com.modisa.classdesign.models.encapsulation.graphicshape;

public class Circle extends Shape {
    private int radius; //private field
    public void area() { //public method
        //access to private field radius inside the class
        System.out.println("area: " + 3.14 * radius * radius);
    }

    //The method below has a default access, because no access modifier we specified
    void fillColor() {
        //access to protected field, in subclass:
        System.out.println("Color: " + color);
    }
}
