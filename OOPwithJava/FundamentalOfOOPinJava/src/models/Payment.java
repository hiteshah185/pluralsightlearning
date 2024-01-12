package models;

import java.util.UUID;

public class Payment {
    private final CreditCard creditCard;
    private int amount;
    private final UUID transactionId;

    public Payment(CreditCard creditCard, int amount, UUID transactionId) {
        this.creditCard = creditCard;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", amount=" + amount +
                ", transactionId=" + transactionId +
                '}';
    }
}
