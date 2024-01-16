package com.teranet.rps.learningcollections.workingWithCollections;

import com.teranet.rps.learningcollections.models.AmazonMapProductLookupTable;
import com.teranet.rps.learningcollections.models.AmazonProduct;
import com.teranet.rps.learningcollections.models.AmzonNaiveProductLookupTable;
import com.teranet.rps.learningcollections.models.ProductLookupTable;

import java.awt.*;
import java.util.*;
import java.util.List;

public class LookupTableComparison {
    private static final int ITERATIONS =5;
    private static final int NUMBER_OF_PRODUCTS = 20_000;
    private static final List<AmazonProduct> products = generateProduct();

    public static void main(String[] args) {
        runLookup( new AmazonMapProductLookupTable());
        runLookup(new AmzonNaiveProductLookupTable());
    }
    private static List<AmazonProduct> generateProduct(){
        final List<AmazonProduct> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for(int i=0; i<NUMBER_OF_PRODUCTS; i++){
            products.add(new AmazonProduct(i,"Product-"+i,10+weightGenerator.nextInt(10)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }
    private static void runLookup(final ProductLookupTable lookupTable){
        final List<AmazonProduct> products = LookupTableComparison.products;
        System.out.println("Running lookup with: "+lookupTable.getClass().getSimpleName());
        for(int i=0;i<ITERATIONS;i++){
            final long startTime = System.currentTimeMillis();
            for(AmazonProduct prod: products){
                lookupTable.addProduct(prod);
            }
            for(AmazonProduct prod: products){
                final AmazonProduct result = lookupTable.lookupById(prod.getId());
                if(result!=prod){
                    throw new IllegalStateException("Lookup Table returned wrong result for: "+ prod);
                }
            }
            lookupTable.clear();
            System.out.println(System.currentTimeMillis()-startTime +"ms");
        }
    }
}
