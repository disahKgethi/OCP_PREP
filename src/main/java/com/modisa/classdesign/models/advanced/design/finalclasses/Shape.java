package com.modisa.classdesign.models.advanced.design.finalclasses;

public abstract class Shape {
    // This method cannot be overridden
    final public void setParentShape(Shape shape) {

    }

    //This method can be overridden
    public abstract Double getParentShape(Double height, Double width);
}
