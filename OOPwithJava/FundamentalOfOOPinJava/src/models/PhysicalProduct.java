package models;

public class PhysicalProduct extends Product{
    private int weight;

    public PhysicalProduct(String itemName, int price, int discount, ProductType type, int weight, int weight1) {
        super(itemName, price, discount, type, weight);
        this.weight = weight1;
    }
    @Override
    public int calculateShippingCost(){
        return Catalogue.SHIPPING_RATE*weight;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
