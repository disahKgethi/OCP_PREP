package com.modisa.classdesign.models.lambda_builtin_functional_interfaces.consumer_interface;

import java.util.function.Consumer;

public class ConsumerInterface implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("Consumer Interface working properly. Object consumed is [" + integer + "]");
    }
}
