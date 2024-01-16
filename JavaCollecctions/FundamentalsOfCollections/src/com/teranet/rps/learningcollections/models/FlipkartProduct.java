package com.teranet.rps.learningcollections.models;

import java.util.Comparator;

//Contains flipkart product definition
public class FlipkartProduct {
    private final String productName;
    private final int weight;
    private final double price;

    public FlipkartProduct(String productName, int weight, double price) {
        this.productName = productName;
        this.weight = weight;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
    public static final Comparator<FlipkartProduct> BY_WEIGHT =
            Comparator.comparingInt(FlipkartProduct::getWeight);
}
