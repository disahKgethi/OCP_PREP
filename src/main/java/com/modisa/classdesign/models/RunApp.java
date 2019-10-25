package com.modisa.classdesign.models;

import com.modisa.classdesign.models.lambda_builtin_functional_interfaces.predicate_interface.PredicateInterface;
import com.modisa.classdesign.models.lambda_builtin_functional_interfaces.consumer_interface.ConsumerInterface;
import com.modisa.classdesign.models.lambda_builtin_functional_interfaces.supplier_interface.SupplierInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunApp {
    public static void main(String[] args) {
        System.out.println("Everything is working fine!!!!");

        /*_______________________[LAMBDA Built-In Functional Interfaces]______________________________________________*/


        /*   Predicate Interface
               It is used for conditional check
               So it returns a boolean
        */
        System.out.println("Predicate Interfaces starts here:");
        PredicateInterface predicateInterface = new PredicateInterface();

        Predicate<String> predicate = string -> string == "Predicates";
        System.out.println(predicate.test("Predicate"));
        //predicateInterface.testPredicate();
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
        SupplierInterface supplierInterface = new SupplierInterface();
        System.out.println(supplierInterface.get());
        Supplier<String> stringSupplier = () -> {
          return "There is no input but is expected to return something";
        };
        System.out.println(stringSupplier.get());
    }
}
