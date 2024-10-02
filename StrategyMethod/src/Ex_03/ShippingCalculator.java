package Ex_03;

public class ShippingCalculator {

    private ShippingStrategy shippingStrategy;

    public ShippingCalculator(ShippingStrategy shippingStrategy ) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double value) {

        return this.shippingStrategy.calculate()*value;
    }

}
