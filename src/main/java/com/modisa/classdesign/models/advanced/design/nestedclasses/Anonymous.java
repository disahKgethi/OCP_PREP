package com.modisa.classdesign.models.advanced.design.nestedclasses;

public class Anonymous {
    public static StaticNonLocal.Inner getDescriptiveColors(final StaticNonLocal.Inner color) {
        return new StaticNonLocal.Inner() {
            public String toString() {
                return "You have selected a color with RGB values " + color;
            }
        };
        //return new DescriptiveColor();
    }
}
