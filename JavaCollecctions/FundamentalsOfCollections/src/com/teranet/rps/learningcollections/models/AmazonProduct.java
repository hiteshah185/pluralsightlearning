package com.teranet.rps.learningcollections.models;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;
public class AmazonProduct {
    public static final Comparator<AmazonProduct> BY_NAME = comparing(AmazonProduct::getName);

    private final int id;
    private final String name;
    private final int weight;

    public AmazonProduct(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public boolean equals(final Object obj){
        if(!(obj instanceof AmazonProduct)){
            return false;
        }
        final AmazonProduct product = (AmazonProduct)obj;
        return Objects.equals(id,product.id)
                && Objects.equals(weight,product.weight)
                && Objects.equals(name,product.name);
    }
    public int hashCode(){
        return Objects.hash(id,name,weight);
    }
}
