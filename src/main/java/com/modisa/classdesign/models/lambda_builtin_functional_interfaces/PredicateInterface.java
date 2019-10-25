package com.modisa.classdesign.models.lambda_builtin_functional_interfaces;

import java.util.stream.Stream;

public class PredicateInterface {
    public void testPredicate() {
        Stream.of("Testing", "Predicate")
                .filter(str -> str.startsWith("T"))
                .forEach(System.out::println);
    }
}
