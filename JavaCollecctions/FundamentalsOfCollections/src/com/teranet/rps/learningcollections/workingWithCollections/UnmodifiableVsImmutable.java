package com.teranet.rps.learningcollections.workingWithCollections;

import javax.swing.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableVsImmutable {
    public static void main(String[] args) {
        Map<String,Integer> countryToPopulation = new HashMap<>();
        countryToPopulation.put("India",125);
        countryToPopulation.put("China",136);
        countryToPopulation.put("USA",32);
        countryToPopulation.forEach((c,p)->{
            System.out.println("Country:"+c+" has "+p +" million population.");
        });
        System.out.println();

        Map<String,Integer> unmodifiableCountryToPopulation = Collections.unmodifiableMap(countryToPopulation);
        //unmodifiableCountryToPopulation.put("Indonesia",25);
        unmodifiableCountryToPopulation.forEach((c,p)->{
            System.out.println("Country:"+c+":"+p);
        });
        System.out.println();

        Map<String, Integer> copiedCountryToPopulation = Map.copyOf(countryToPopulation);
        //copiedCountryToPopulation.put("Brazil",20);
        copiedCountryToPopulation.forEach((c,p)->{
            System.out.println("Country:"+c+":"+p);
        });

        var countryToPop = Map.of("UK",67,"USA","328");
    }
}
