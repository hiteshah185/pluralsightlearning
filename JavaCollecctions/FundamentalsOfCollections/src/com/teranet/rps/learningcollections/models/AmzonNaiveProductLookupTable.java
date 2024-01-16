package com.teranet.rps.learningcollections.models;

import java.util.ArrayList;
import java.util.List;

public class AmzonNaiveProductLookupTable implements ProductLookupTable{
    private final List<AmazonProduct> amazonProductList = new ArrayList<>();
    @Override
    public void addProduct(AmazonProduct productToAdd) {
        int id = productToAdd.getId();
        for(AmazonProduct azProd:amazonProductList){
            if(azProd.getId()==id){
                throw new IllegalArgumentException(
                        "Unable to add Amazon Product, duplicate id for:"+productToAdd
                );
            }
        }
        amazonProductList.add(productToAdd);
    }
    @Override
    public AmazonProduct lookupById(int id) {
       for(final AmazonProduct prod: amazonProductList){
           if(prod.getId() == id){
               return prod;
           }
       }
       return null;
    }
    @Override
    public void clear() {
        amazonProductList.clear();
    }
}
