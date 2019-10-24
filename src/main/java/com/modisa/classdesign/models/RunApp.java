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
import com.modisa.classdesign.models.genericsandcollections.collectionclasses.CollectionClass;
import com.modisa.classdesign.models.genericsandcollections.collectionclasses.TreeSets;
import com.modisa.classdesign.models.genericsandcollections.comparable.Student;
import com.modisa.classdesign.models.genericsandcollections.genericclasses.BoxPrinter;
import com.modisa.classdesign.models.genericsandcollections.genericclasses.Pair;
import com.modisa.classdesign.models.genericsandcollections.genericmethods.Utilities;
import com.modisa.classdesign.models.genericsandcollections.genericsubtyping.TestPurpose;
import com.modisa.classdesign.models.genericsandcollections.mapinterface.NavigableMapTest;
import com.modisa.classdesign.models.genericsandcollections.queueing.SplQueue;
import com.modisa.classdesign.models.genericsandcollections.rawtype.RawTest;

import java.util.Arrays;

public class RunApp {
    public static void main(String[] args) {
        System.out.println("Everything is working fine!!!!");

        /*_______________________[Generics and Collections]__________________________________________________________________________________________*/

        // Generic Classes
        System.out.println("Generic Classes starts here: ");

        BoxPrinter<Integer> val1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(val1);

        BoxPrinter<String> val2 = new BoxPrinter<String>(new String("Generic Class working"));
        System.out.println(val2);

        Pair<Integer, String> pair = new Pair<Integer, String>(2010, "South Africa");
        System.out.println("World Cup " + pair.getVal2() + " in " + pair.getVal1());

        // Raw Types
        RawTest rawTest = new RawTest();
        rawTest.myTest();
        rawTest.myTest2();

        // Generic Methods
        Utilities utilities = new Utilities();
        utilities.testFill();

        // Generic Subtyping and Wildcard Parameters
        TestPurpose testPurpose = new TestPurpose();
        testPurpose.fillList();

        // Collection Classes [Abstract Classes and Interface]
        CollectionClass collectionClass = new CollectionClass();
        collectionClass.collClass();

        TreeSets treeSets = new TreeSets();
        treeSets.treeSet();

        // Map Interface
        NavigableMapTest navigableMapTest = new NavigableMapTest();
        navigableMapTest.navigateMapTest();

        // The Deque Interface and ArrayDeque class
        SplQueue splQueue = new SplQueue();
        splQueue.testHere();

        //Comparable and Comparator Interfaces
        Student student[] = {new Student("211365102", "Modisa", 3.1),
                                new Student("211365103", "Malusi", 3.4),
                                new Student("211365104", "Phomolo", 2.7),
                                new Student("211365105", "Sphelele", 3.7)};

        System.out.println("Before sorting by student ID");
        System.out.println("Student-ID \t Name \t CGPA (for 4.0)");
        System.out.println(Arrays.toString(student));

        Arrays.sort(student);

        System.out.println("After sorting by student ID");
        System.out.println("Student-ID \t Name \t CGPA (for 4.0)");
        System.out.println(Arrays.toString(student));
    }
}
