package com.teranet.rps.learningcollections.models;

public interface ProductLookupTable {
    AmazonProduct lookupById(int id);
    void addProduct(AmazonProduct product);
    void clear();
}
