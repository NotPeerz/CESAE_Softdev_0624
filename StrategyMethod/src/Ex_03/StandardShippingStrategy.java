package Ex_03;

public class StandardShippingStrategy implements ShippingStrategy{
    private double peso;

    public StandardShippingStrategy() {
        this.peso = 5.0;
    }

    @Override
    public double calculate() {

        return this.peso;
    }
}
