package com.teranet.rps.learningcollections.workingWithCollections;

import com.teranet.rps.learningcollections.models.FlipkartProduct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamProducts {
    public static void main(String[] args) {
        FlipkartProduct door = new FlipkartProduct("Wooden Door",3000,5000);
        FlipkartProduct floorPanel = new FlipkartProduct("Glass Floor",4000,8000);
        FlipkartProduct window = new FlipkartProduct("Framed Window",6000,7000);
        List<FlipkartProduct> newProductList = new ArrayList<>();
        newProductList.add(door);
        newProductList.add(floorPanel);
        newProductList.add(window);
        namesOfLightProducts(newProductList);
        Map<String , Long> lightProducts = newProductList
                .stream()
                .filter(prod->prod.getWeight()<5000)
                .sorted(Comparator.comparing(FlipkartProduct::getWeight))
                .collect(groupingBy(FlipkartProduct::getProductName,counting()));
        System.out.println(lightProducts);
    }
    private static void namesOfLightProducts(List<FlipkartProduct> productList){
        productList
                .stream()
                .filter(prod->prod.getWeight()<5000)
                .sorted(Comparator.comparingInt(FlipkartProduct::getWeight))
                .map(FlipkartProduct::getProductName)
                .distinct()
                .forEach(
                        System.out::println
                );
    }

}
