package com.modisa.classdesign.models;

import com.modisa.classdesign.models.classdesign.constructor.overloading.Calculator;
import com.modisa.classdesign.models.classdesign.invoking.superclass.Point2D;
import com.modisa.classdesign.models.classdesign.invoking.superclass.Point3D;
import com.modisa.classdesign.models.classdesign.overiding.object.clas.Point;
import com.modisa.classdesign.models.classdesign.overload.resolution.OverloadResolution;
import com.modisa.classdesign.models.classdesign.polymorphism.dynamicpoly.Circle;
import com.modisa.classdesign.models.classdesign.polymorphism.dynamicpoly.Shape;
import com.modisa.classdesign.models.classdesign.polymorphism.dynamicpoly.Square;
import com.modisa.classdesign.models.classdesign.polymorphism.staticpoly.Calculate;
import com.modisa.classdesign.models.classdesign.statickeyword.Counter;

public class RunApp {
    public static void main(String[] args) {
        /*Inheritance
            CODE
         */
        //Create a number array
/*        Number number[] = new Number[4];
        //assign derived class objects
        number[0] = new Byte((byte)10);
        number[1] = new Integer(10);
        number[2] = new Float(10f);
        number[3] = new Double(10f);
        //pass the Number array to sum and print the results
        //_________________________________________________________________________________________________________________
        System.out.println("The sum of numbers is: " + sum(number));*/

        /*Polymorphism Code
            CODE
          In Java We have two different types of polymorphisms
            -> (Static (Early/Compile time polymorphism)) [Method Overloading]
            -> (Dynamic (Late/Run time polymorphism)) [Method Overriding]
         */

        //Dynamic Polymorphism from package [dynamicpoly]
        Shape shape1 = new Circle(10);
        System.out.println(shape1.area());
        Shape shape2 = new Square(10);
        System.out.println(shape2.area());

        //Static Polymorphism from package [staticpoly]
        System.out.println("Static Polymorphism starts here:");
        Calculate calc = new Calculate();
        System.out.println(calc.add(1, 2) + "parameters are INT and INT");
        System.out.println(calc.add(1.0, 2) + "parameters are DOUBLE and INT");
        System.out.println(calc.add(1, 2.0) + "parameters are INT and DOUBLE");
        System.out.println(calc.add(1, 2, 3)+ "parameters are INT, INT and INT");
        //_________________________________________________________________________________________________________________

        //Constructor overloading is similar to method overloading
        System.out.println("Constructor overloading starts here:");
        Calculator calc1 = new Calculator(1, 2);
        Calculator calc2 = new Calculator(1.1, 2);
        Calculator calc3 = new Calculator(1, 2.1);
        Calculator calc4 = new Calculator(1, 2, 3);
        System.out.println(calc1 + "\n" + calc2 + "\n" + calc3 + "\n" + calc4);
        //_________________________________________________________________________________________________________________
        //Overload Resolution
        System.out.println("Overload Resolution starts here: ");
        byte b = 9;
        OverloadResolution or = new OverloadResolution();
        //can you guess the output of the calls before you run this? and why?
        or.aMethod(b); //1st call
        or.aMethod(9); // 2nd call
        Integer i = 9;
        or.aMethod(i); // 3rd call
        or.aMethod("9"); // 4th call
        //After guessing and compiling the method above, were you correct about the outputs? page 20 has more explanation

        //This process of the compiler trying to resolve the method definitions is called overload resolution

        // Overload resolution fails (with compiler error) if there are no matches or ambiguous matches.
     //_________________________________________________________________________________________________________________


        //Overriding Methods in Object class
        System.out.println("Overriding Methods in Object class starts here");
        System.out.println(new Point(10, 20));
        //_________________________________________________________________________________________________________________

        System.out.println("Invoking Super class starts here: ");
        System.out.println(new Point2D(10, 20));
        System.out.println(new Point3D(10, 20, 30));
        //_________________________________________________________________________________________________________________


        System.out.println("Object composition starts here: ");
        System.out.println(new com.modisa.classdesign.models.classdesign.object.composition.Circle(10, 10, 20));
        //_________________________________________________________________________________________________________________


        System.out.println("Using Static Keyword starts here: ");
        //Before running this code, remove static keyword of variable count in the Counter class and look at the results
        Counter counter = new Counter();
        counter.printCount();
        Counter counter2 = new Counter();
        counter2.printCount();

    }
}