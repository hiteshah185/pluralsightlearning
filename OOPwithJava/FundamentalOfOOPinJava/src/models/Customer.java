package models;

public class Customer {
    public Order checkOut(ShoppingCart cart){
        Payment payment = new Payment();
        return new Order(this,cart,payment);
    }
}
