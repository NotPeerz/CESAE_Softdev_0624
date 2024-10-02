package Ex_02;

public class FlatDiscountStrategy implements DiscountStrategy{

    private double flat;

    public FlatDiscountStrategy(double flat) {
        this.flat = flat;
    }

    @Override
    public double discount() {
        //implementar logica de desconto
        return this.flat * 1;
    }

}