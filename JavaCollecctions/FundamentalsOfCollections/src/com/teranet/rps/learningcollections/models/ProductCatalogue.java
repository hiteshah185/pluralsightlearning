package com.teranet.rps.learningcollections.models;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable<FlipkartProduct>{
    private final Set<FlipkartProduct> products = new HashSet<>();
    public void addSupplier(final Supplier supplier){
        products.addAll(supplier.getProducts());
    }
    @Override
    public Iterator<FlipkartProduct> iterator() {
        return products.iterator();
    }
}
