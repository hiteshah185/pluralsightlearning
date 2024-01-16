package com.teranet.rps.learningcollections.models;

import java.util.HashMap;
import java.util.Map;

public class AmazonMapProductLookupTable implements ProductLookupTable{
    private final Map<Integer,AmazonProduct> idToAmazonProduct = new HashMap<>();
    @Override
    public void addProduct(AmazonProduct product) {
    int id = product.getId();
    if(idToAmazonProduct.containsKey(id)){
    throw new IllegalArgumentException(
            "Unable to add Amazon Product, duplicate id for:"+product
    );
    }
    idToAmazonProduct.put(id,product);
    }
    @Override
    public AmazonProduct lookupById(int id) {
        return idToAmazonProduct.get(id);
    }
    @Override
    public void clear() {
        idToAmazonProduct.clear();
    }
}
