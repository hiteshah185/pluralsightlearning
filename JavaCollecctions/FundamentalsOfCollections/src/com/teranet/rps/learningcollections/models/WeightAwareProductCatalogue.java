package com.teranet.rps.learningcollections.models;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class WeightAwareProductCatalogue implements Iterable<FlipkartProduct>{
    private final NavigableSet<FlipkartProduct> products = new TreeSet<>(FlipkartProduct.BY_WEIGHT);
    public void addSupplier(final Supplier supplier){
        products.addAll(supplier.getProducts());
    }
    public Set<FlipkartProduct> findLighterProducts(final FlipkartProduct flipkartProduct){
        return products.headSet(flipkartProduct,false);
    }

    @Override
    public Iterator<FlipkartProduct> iterator() {
        return null;
    }
}
