package Ex_03;

public class ExpressShippingStrategy implements ShippingStrategy{
    private double peso;

    public ExpressShippingStrategy() {
        this.peso = 10.0;
    }

    @Override
    public double calculate() {

        return this.peso;
    }
}
