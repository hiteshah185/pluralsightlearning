package models;

import java.util.UUID;

public class Payment {
    private CreditCard creditCard;
    private int amount;
    private UUID transactionId;

    public Payment(CreditCard creditCard, int amount, UUID transactionId) {
        this.creditCard = creditCard;
        this.amount = amount;
        this.transactionId = transactionId;
    }
}
