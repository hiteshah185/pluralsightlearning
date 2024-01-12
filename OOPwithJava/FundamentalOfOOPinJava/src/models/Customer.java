package models;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Customer {
    private final String name;
    private  CreditCard creditCard;

    public Customer(String name, long creditCard) {
        this.name = name;
        this.creditCard = new CreditCard(creditCard);
    }

    public Order checkout(ShoppingCart cart) {
        Payment payment = creditCard.makePayment(cart.getTotalCost());
        return new Order(this,cart,payment);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
