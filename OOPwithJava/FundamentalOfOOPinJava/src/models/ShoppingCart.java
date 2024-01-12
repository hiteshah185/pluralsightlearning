package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<LineItem> lineItems = new ArrayList<>();

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
    public void addLineItem(LineItem lineItem){
        lineItems.add(lineItem);
    }
    public void addLineItem(Product product, int quantity){
        this.addLineItem(new LineItem(product,quantity));
    }

/*    public Order checkOut(Customer customer){
        Payment payment = new Payment();
        return new Order(customer,this,payment);
    }*/

    public int getTotalCost() {
        return lineItems.stream()
                .mapToInt(LineItem::getQuantity).sum();
    }
}
