package models;

import java.util.Optional;

public interface PaymentMethod {
    public Optional<Payment> mkePayment(int amount);
}
