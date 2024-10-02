package Ex_02;

public class PaymentProcessor {
    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double value) {

        return this.discountStrategy.discount()*value;
    }

}
