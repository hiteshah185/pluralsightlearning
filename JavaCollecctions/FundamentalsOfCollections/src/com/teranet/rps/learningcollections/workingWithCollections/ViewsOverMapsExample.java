package com.teranet.rps.learningcollections.workingWithCollections;

import com.teranet.rps.learningcollections.models.AProductFixtures;
import com.teranet.rps.learningcollections.models.AmazonProduct;

import java.util.*;

public class ViewsOverMapsExample {
    public static void main(String[] args) {
        final Map<Integer, AmazonProduct> idToProducts = new HashMap<>();
        idToProducts.put(1,AProductFixtures.cable);
        idToProducts.put(222,AProductFixtures.giftCard);
        idToProducts.put(36,AProductFixtures.echoDot);

        Set<Integer> ids = idToProducts.keySet();
        System.out.println(ids);
        ids.remove(222);
        System.out.println(ids);
        System.out.println(idToProducts);

        Collection<AmazonProduct> products =idToProducts.values();
        System.out.println(products);
        System.out.println(idToProducts);

        //var entries = idToProducts.entrySet();
        Set<Map.Entry<Integer,AmazonProduct>> entrySet = idToProducts.entrySet();
        for(Map.Entry<Integer,AmazonProduct> entry:entrySet){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map.Entry<Integer, AmazonProduct> entry = Map.entry(3,AProductFixtures.cable);
        //entrySet.add(entry); //Cannot add using entries
        System.out.println(idToProducts);

    }
}
