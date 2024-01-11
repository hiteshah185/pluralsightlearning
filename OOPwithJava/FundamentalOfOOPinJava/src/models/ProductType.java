package models;

public enum ProductType {
    DIGITAL(0),
    PHYSICAL(Catalogue.SHIPPING_RATE);
    private final int shippingRate;

    ProductType(int shippingRate) {
        this.shippingRate = shippingRate;
    }
    public int getShippingRate(int weight){
        return shippingRate*weight;
    }

}