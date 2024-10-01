package Ex_01;

public class Eletronics extends Product{
    public Eletronics(String name, double price) {
        super(price, name);
    }
    @Override
    public void display() {
        System.out.print("Produto do tipo: Eletronico");
    }
}
