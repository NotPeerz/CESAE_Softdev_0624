package Ex_01;

public abstract class Product {
    protected String name;
    protected double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void display();

}
