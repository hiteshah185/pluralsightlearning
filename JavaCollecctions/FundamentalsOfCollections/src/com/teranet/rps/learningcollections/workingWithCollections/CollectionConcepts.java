package com.teranet.rps.learningcollections.workingWithCollections;

import com.teranet.rps.learningcollections.models.FlipkartProduct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
        products.add(book);

        for(FlipkartProduct item:products){
            System.out.println(item.toString());
        }

        // Refactor to use iterator to remove products.
        Iterator<FlipkartProduct> iterator = products.iterator();
        while (iterator.hasNext()){
            final FlipkartProduct product = iterator.next();
            if(product.getPrice()>30000){
                iterator.remove();
            }
        }
        System.out.println(products);

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(book));
        products.remove(phone);

        System.out.println(products);

        List<FlipkartProduct> flipkartProductList = new ArrayList<>();
        flipkartProductList.add(book);
        flipkartProductList.add(phone);
        for(FlipkartProduct prod:flipkartProductList){
            System.out.println(prod.getProductName());
        }
        flipkartProductList.removeAll(products);
        System.out.println("List after removing using a collection List:");
        for(FlipkartProduct prod:flipkartProductList){
            System.out.println(prod.getProductName());
        }




    }
}
