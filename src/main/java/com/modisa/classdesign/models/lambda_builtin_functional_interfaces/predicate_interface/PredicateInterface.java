package com.modisa.classdesign.models.lambda_builtin_functional_interfaces.predicate_interface;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateInterface implements Predicate<String> {
/*
    public void testPredicate() {
        Stream.of("Testing", "Predicate")
                .filter(str -> str.startsWith("T"))
                .forEach(System.out::println);
    }
*/

    @Override
    public boolean test(String s) {
        if (s == "Testing")
            return true;
        return false;
    }
}
