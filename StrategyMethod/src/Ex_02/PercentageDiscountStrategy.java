package Ex_02;

public class PercentageDiscountStrategy implements DiscountStrategy{

    private double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discount() {
        //implementar logica de desconto
        return this.percentage * 1;
    }

}
