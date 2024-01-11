package models;

import java.util.HashMap;
import java.util.Map;

import static models.ProductType.DIGITAL;
import static models.ProductType.PHYSICAL;


public class Catalogue {
    public final static int SHIPPING_RATE = 10;
    public static Map<String,Product> productMap = new HashMap<>();
    static {
        productMap.put("Electric Toothbrush",new Product("Electric Toothbrush",3000,PHYSICAL,400));
        productMap.put("Books",new Product("Classmates notebook",90,PHYSICAL,50));
        productMap.put("Music",new Product("Film Song",90,DIGITAL,0));
    }
    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
