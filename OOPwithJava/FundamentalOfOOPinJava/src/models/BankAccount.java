package models;

import java.util.Optional;
import java.util.UUID;

public class BankAccount implements PaymentMethod{
    private final int sortCode;
    private final long accountNumber;

    public BankAccount(int sortCode, long accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public Optional<Payment> mkePayment(int amount) {
        return Optional.of(new Payment(this,amount, UUID.randomUUID()));
    }
}
