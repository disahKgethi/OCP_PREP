package com.modisa.classdesign.models.overload.resolution;

public class OverloadResolution {
    public void aMethod (int val) {
        System.out.println("int");
    }

    public void aMethod (short val) {
        System.out.println("short");
    }

    public void aMethod (Object val) {
        System.out.println("object");
    }

    public void aMethod (String val) {
        System.out.println("String");
    }
}
