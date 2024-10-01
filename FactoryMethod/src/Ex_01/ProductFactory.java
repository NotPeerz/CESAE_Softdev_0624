package Ex_01;

public class ProductFactory {
    public static Product createProduct (String type, String name, double price) {
        switch(type){
            case "book" : return new Book(name,price);

            case "eletronics" : return new Eletronics(name,price);

            case "clothing" : return new Clothing(name,price);

            case "food" : return new Food(name,price);

            default:
                throw new IllegalArgumentException("Tipo de produto inválido: "+type);
        }
    }
}
