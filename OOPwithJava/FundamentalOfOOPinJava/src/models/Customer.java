package models;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Customer {
    private final String name;
    private  CreditCard creditCard;

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }

    public Optional<Order> checkout(ShoppingCart cart) {
        Optional<Payment> payment = creditCard.makePayment(cart.getTotalCost());
        return payment.map(p -> new Order(this, cart, p));
    }
}
