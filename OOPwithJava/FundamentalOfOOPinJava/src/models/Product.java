package models;

public class Product {
    private final String itemName;
    private int price;
    private int discount;
    private final ProductType type;
    private int weight;

    public Product(String itemName, int price, int discount, ProductType type, int weight) {
        this.itemName = itemName;
        this.price = price;
        this.discount = discount;
        this.type = type;
        this.weight = weight;
    }

}
