package models;

import java.util.Optional;
import java.util.UUID;

public class CreditCard implements PaymentMethod{
    private final long cardNumber;
    CreditCard(long cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public Payment mkePayment(int value){
        if(Math.random()>0.3){
            return new Payment(this,value, UUID.randomUUID());
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                '}';
    }


}
