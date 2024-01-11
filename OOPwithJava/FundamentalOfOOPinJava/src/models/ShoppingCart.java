package models;

public class ShoppingCart {
    public Order checkOut(Customer customer){
        Payment payment = new Payment();
        return new Order(customer,this,payment);
    }
}
