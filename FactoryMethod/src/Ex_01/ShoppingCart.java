package Ex_01;

public class ShoppingCart extends Product{
    public ShoppingCart(String name, double price) {
    super(price, name);
}

    @Override
    public void display() {
        System.out.print("Produto do tipo: Livro");
    }
}
