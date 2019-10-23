package com.modisa.classdesign.models;

import com.modisa.classdesign.models.advanced.design.abstractcclasses.Rectangle;
import com.modisa.classdesign.models.advanced.design.abstractcclasses.Shape;
import com.modisa.classdesign.models.advanced.design.anonymousinnerclasses.TestAnonymous;
import com.modisa.classdesign.models.advanced.design.enumdata.type.EnumTest;
import com.modisa.classdesign.models.advanced.design.enumdata.type.PrinterType;
import com.modisa.classdesign.models.advanced.design.enumdata.type.PrinterTypeCapacity;
import com.modisa.classdesign.models.advanced.design.functionalinterfaces.BlockLambda;
import com.modisa.classdesign.models.advanced.design.functionalinterfaces.TestLambda;
import com.modisa.classdesign.models.advanced.design.interfaces.Circle;
import com.modisa.classdesign.models.advanced.design.nestedclasses.Anonymous;
import com.modisa.classdesign.models.advanced.design.nestedclasses.InnerNonLocal;
import com.modisa.classdesign.models.advanced.design.nestedclasses.LocalInner;
import com.modisa.classdesign.models.advanced.design.nestedclasses.StaticNonLocal;

public class RunApp {
    public static void main(String[] args) {
        System.out.println("Everything is working fine!!!!");

        /*_______________________[Advanced Class Design Tests]__________________________________________________________________________________________*/
        //Abstract classes
        System.out.println("Abstract classes starts here: ");
        Shape shape = new Rectangle();

        System.out.println("Area = " + shape.area(10, 10));
        //_________________________________________________________________________________________________________________


        //Final Classes and Methods
        /*
            Final classes cannot be extended
            Final Methods cannot be overridden
            Final Values cannot be changed after they have been initialised
        */
        System.out.println("Final classes starts here: ");

        //_________________________________________________________________________________________________________________


        // Nested Classes

        /*
            We have 4 different types of nested classes and below I have described them

            1. We have 2 types of Inner non-local inner classes
                1. static inner class (static class within a class)
                2. non-static inner class (an ordinary class within a class)
            2. We also have 2 types of Inner local classes
                1. Local inner class -> is a class within a method/constructor of another class
                2. Anonymous Inner class -> is almost the same as Local Inner class the only difference
                   is that it does'nt have a name...so it means it also does'nt have a constructor
        */
        System.out.println("Nested classes starts here: ");
        StaticNonLocal.Inner inner = new StaticNonLocal.Inner(1, 1, 1);
        System.out.println("Test colors: " + inner);
        System.out.println(new InnerNonLocal(10, 20, 30));
        StaticNonLocal.Inner descriptiveColor =
                LocalInner.getDescriptiveColor(new StaticNonLocal.Inner(1, 2, 3));
        System.out.println(descriptiveColor);
        StaticNonLocal.Inner descriptiveColors =
                Anonymous.getDescriptiveColors(new StaticNonLocal.Inner(1, 2, 3));
        System.out.println(descriptiveColors);

        //_________________________________________________________________________________________________________________


        // Enums
        /*
            Enum constructors cannot be public
            Comparing two Enum constants from different enumeration will return false
        */
        System.out.println("Enum starts here: ");
        EnumTest enumTest = new EnumTest(PrinterType.LASER);
        enumTest.feature();
        EnumTest enumTest1 = new EnumTest(PrinterTypeCapacity.LASER);
        enumTest1.testCapacit();
        EnumTest enumTest2 = new EnumTest(PrinterTypeCapacity.INKJET);
        enumTest2.testCapacit();
        EnumTest enumTest3 = new EnumTest(PrinterTypeCapacity.DOTMATRIX);
        enumTest3.testCapacit();

        //_________________________________________________________________________________________________________________


        // Interfaces

        /*
            Interface is set of abstract methods that describe a protocol
            Classes that implement the interface must implement the methods inside the interface
        */
        System.out.println("Interfaces starts here: ");
        Circle circle = new Circle(1,2, 3);
        circle.roll(45);
        System.out.println("\n");

        //_________________________________________________________________________________________________________________


        // Functional Interfaces and Lambda Expression

        System.out.println("Functional Interface starts here");
        // IntConsumer myL = (int a) -> {Objects.requireNonNull(after); return anotherLambda}
        TestLambda myLambda = () -> 1 + 2;
        System.out.println(myLambda.printLambda());
        BlockLambda blockLambda = (int a) -> {
            if ((a % 2) == 0) return "Even";
            return "odd";
        };

        System.out.println(blockLambda.intKind(12));

        //_________________________________________________________________________________________________________________


        // Anonymous Inner Classes

        System.out.println("Anonymous Inner Classes starts here");
        TestAnonymous testAnonymous = new TestAnonymous(){
            public void printAnonymous() {
                System.out.println("Print from inner class");
            }
        };

        testAnonymous.printAnonymous();
    }
}
