package com.modisa.classdesign.models.lambda_builtin_functional_interfaces.supplier_interface;

import java.util.function.Supplier;

public class SupplierInterface implements Supplier<String> {
    @Override
    public String get() {
        return ("No Input But it must return something");
    }
}
