package com.teranet.rps.learningcollections.models;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final String name;
    private final List<FlipkartProduct> products = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<FlipkartProduct> getProducts() {
        return products;
    }

}
