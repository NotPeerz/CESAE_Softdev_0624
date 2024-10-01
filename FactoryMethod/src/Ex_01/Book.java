package Ex_01;

public class Book extends Product{
    public Book(String name, double price) {
        super(price, name);
    }

    @Override
    public void display() {
        System.out.print("Produto do tipo: Livro");
    }
}
