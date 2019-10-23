package com.modisa.classdesign.models.advanced.design.nestedclasses;

public class LocalInner {
    public static StaticNonLocal.Inner getDescriptiveColor(final StaticNonLocal.Inner color) {
        class DescriptiveColor extends StaticNonLocal.Inner {
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        }
        return new DescriptiveColor();
    }
}
