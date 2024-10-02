package Ex_03;

public class OvernightShippingStrategy implements ShippingStrategy{
    private double peso;

    public OvernightShippingStrategy() {
        this.peso = 15.0;
    }

    @Override
    public double calculate() {

        return this.peso;
    }
}
