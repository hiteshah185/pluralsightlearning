package models;

public class DigitalProduct extends Product{
    public DigitalProduct(String itemName, int price, int discount, ProductType type, int weight) {
        super(itemName, price, discount, type, weight);
    }
    @Override
    public int calculateShippingCost(){
        return 0;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
