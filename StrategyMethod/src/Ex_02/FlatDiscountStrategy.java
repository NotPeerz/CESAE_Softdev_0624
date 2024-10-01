package Ex_02;

public class FlatDiscountStrategy implements DiscountStrategy{

    @Override
    public void discount() {
        System.out.println("Flat Discount");
        //Lógica para desconto flácido
    }
}
