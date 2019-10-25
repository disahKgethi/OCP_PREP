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
import com.modisa.classdesign.models.lambda_builtin_functional_interfaces.PredicateInterface;
import com.modisa.classdesign.models.lambda_builtin_functional_interfaces.consumer_interface.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RunApp {
    public static void main(String[] args) {
        System.out.println("Everything is working fine!!!!");

        /*_______________________[LAMBDA Built-In Functional Interfaces]______________________________________________*/


        /*   Predicate Interface
               It is used for conditional check
               So it returns a boolean
        */
        System.out.println("Predicate Interfaces starts her:");
        PredicateInterface predicateInterface = new PredicateInterface();
        predicateInterface.testPredicate();
        //______________________________________________________________________________________________________________


        /*   Consumer Interface
               It can be used in all contexts where an object needs to be consumed
               It returns nothing
        */
        System.out.println("Consumer Interfaces starts her:");
        ConsumerInterface consumerInterface = new ConsumerInterface();
        consumerInterface.accept(50);
        //Using Lambda Expression
        Consumer consumer = integer ->
            System.out.println("Consumer Interface working properly. Object consumed is [" + integer + "] \n" +
                    "printed from Lambda");
        consumer.accept(50);
        List<Integer> integerList = Arrays.asList(2, 4, 6, 8, 10);
        integerList.stream().forEach(consumer);

        integerList.stream().forEach(t ->
                System.out.println("Consumer Interface working properly. Object consumed is [" + t + "] \n" +
                "printed from Lambda"));
        //______________________________________________________________________________________________________________


        /*   Supplier Interface
               It can be used in all contexts where there is no input but output is expected
               It return Object passed
        */
        System.out.println("Supplier Interfaces starts her:");

    }
}
