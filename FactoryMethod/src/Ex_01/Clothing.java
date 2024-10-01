package Ex_01;

public class Clothing extends Product{
    public Clothing(String name, double price) {
        super(price, name);
    }
    @Override
    public void display() {
        System.out.print("Produto do tipo: Roupa");
    }
}
