package Ex_01;

public class Main {
    public static void main(String[] args) {
        Product javaHeadFirst = ProductFactory.createProduct("book","javaHeadFirst",50);
        Product pcHP = ProductFactory.createProduct("eletronics","pcHP",1500);
        Product torradeira = ProductFactory.createProduct("torradeira", "torradeira Phillips",100);
        Product tshirt = ProductFactory.createProduct("clothing","T-shirt",20);

        javaHeadFirst.display();
        pcHP.display();
        torradeira.display();
        tshirt.display();
    }
}