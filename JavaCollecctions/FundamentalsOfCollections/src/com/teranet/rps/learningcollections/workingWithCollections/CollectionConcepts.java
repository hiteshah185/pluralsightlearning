package com.teranet.rps.learningcollections.workingWithCollections;

import com.teranet.rps.learningcollections.models.FlipkartProduct;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts {
    public static void main(String[] args) {
        FlipkartProduct phone = new FlipkartProduct("Iphone",1500,49999);
        FlipkartProduct tv = new FlipkartProduct("Samsung HD",4000,40000);
        FlipkartProduct book = new FlipkartProduct("Fault in out Stars",300,299);

     /*   FlipkartProduct[] productsList = {book,tv};
        for(FlipkartProduct prod:productsList){
            System.out.println(prod.toString());
        }*/

        Collection<FlipkartProduct> products = new ArrayList<>();
        products.add(phone);
        products.add(tv);

        for(FlipkartProduct item:products){
            System.out.println(item.toString());
        }

    }
}
