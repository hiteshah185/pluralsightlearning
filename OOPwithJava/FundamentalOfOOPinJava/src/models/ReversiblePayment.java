package models;

public abstract class ReversiblePayment implements PaymentIntf{
    private final PaymentIntf paymentIntf;

    public ReversiblePayment(PaymentIntf paymentIntf) {
        this.paymentIntf = paymentIntf;
    }
    @Override
    public void execute(){
        paymentIntf.execute();
    }
 /*   @Override
    public void setValue(int value);{
        paymentIntf.setValue(vale);
    }*/
}
