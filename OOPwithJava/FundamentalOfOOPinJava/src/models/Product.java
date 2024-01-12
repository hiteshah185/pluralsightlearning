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

    public String getItemName() {
        return itemName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if(discount>0 && discount<=100){
            this.discount = discount;
        }
        else {
            this.discount=0;
        }
    }

    public ProductType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getSellingPrice(){
        return this.price-this.discount*this.price;
    }
    public int getDiscountedPrice(){
        return this.discount!=0 ? this.getSellingPrice() : this.price;
    }
}
