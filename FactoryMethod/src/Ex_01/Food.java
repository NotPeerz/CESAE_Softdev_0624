package Ex_01;

public class Food extends Product{
    public Food(String name, double price) {
        super(price, name);
    }

    @Override
    public void display() {
        System.out.print("Produto do tipo: Livro");
    }
}
