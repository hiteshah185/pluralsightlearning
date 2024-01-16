package com.teranet.rps.learningcollections.workingWithCollections;

import com.teranet.rps.learningcollections.models.AProductFixtures;
import com.teranet.rps.learningcollections.models.AmazonProduct;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        final AmazonProduct defProduct = new AmazonProduct(-1,"A new Product",1000);
        final Map<Integer,AmazonProduct> idToProductMap = new HashMap<>();
        idToProductMap.put(1, AProductFixtures.giftCard);
        idToProductMap.put(2,AProductFixtures.cable);
        idToProductMap.put(3,AProductFixtures.echoDot);

        AmazonProduct result = idToProductMap.getOrDefault(10,defProduct);
        System.out.println(result);
        System.out.println(idToProductMap.get(10));
        System.out.println();


        result = idToProductMap
                .computeIfAbsent(10,(id)-> new AmazonProduct(id,"Custom Product",100));
        System.out.println(result);
        System.out.println(idToProductMap.get(10));
        System.out.println();


        result = idToProductMap
                .replace(1, new AmazonProduct(1,"First Product",90));
        System.out.println(result);
        System.out.println(idToProductMap.get(1));
        System.out.println();

        idToProductMap.replaceAll((key,oldProduct)->
                new AmazonProduct(oldProduct.getId(),oldProduct.getName(), oldProduct.getWeight()+100));
        System.out.println(idToProductMap);
        System.out.println();

        idToProductMap.forEach(
                (key,value)->{
                    System.out.println(key+"->"+value);
                }
        );

    }
}
