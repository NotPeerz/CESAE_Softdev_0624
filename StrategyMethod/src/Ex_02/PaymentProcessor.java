package Ex_02;

public class PaymentProcessor {
    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void calculateTotal() {
        discountStrategy.discount();
    }


}
