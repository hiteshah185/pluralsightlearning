package com.teranet.rps.learningcollections.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<FlipkartProduct> {
    private static final int LIGHT_VAN_MAX_WRIGHT = 20;
    private static final int MISSING_PRODUCT = -1;
    private final List<FlipkartProduct> products = new ArrayList<>();
    private List<FlipkartProduct> lightProducts;
    private List<FlipkartProduct> heavyProducts;
    public void add(FlipkartProduct product){
        products.add(product);
    }

    public boolean replace(FlipkartProduct oldProduct,FlipkartProduct newProduct){
        int position = products.indexOf(oldProduct);
        if(position == MISSING_PRODUCT){
            return false;
        }else {
            products.set(position,newProduct);
            return true;
        }
    }

    public void prepare(){
        products.sort(FlipkartProduct.BY_WEIGHT);
        int splitPoint =findSplitPoint();
        lightProducts = Collections.unmodifiableList(products.subList(0,splitPoint));
        heavyProducts = Collections.unmodifiableList(products.subList(splitPoint,products.size()));
    }

    private int findSplitPoint(){
    int size = products.size();
    for(int i=0;i<size;i++){
        FlipkartProduct product = products.get(i);
        if(product.getWeight() > LIGHT_VAN_MAX_WRIGHT){
            return i;
        }
    }
    return 0;
    }

    public List<FlipkartProduct> getProducts() {
        return products;
    }

    public List<FlipkartProduct> getLightProducts() {
        return lightProducts;
    }

    public List<FlipkartProduct> getHeavyProducts() {
        return heavyProducts;
    }

    @Override
    public Iterator<FlipkartProduct> iterator() {
        return products.iterator();
    }
}
