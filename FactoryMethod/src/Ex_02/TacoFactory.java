package Ex_02;


public class TacoFactory {
    public static Taco createTaco (String type) {
        switch(type){
            case "taco de carne de vaca" : return new TacoVaca();

            case "taco de carne de frango" : return new TacoFrango();

            case "taco vegetariano" : return new TacoVeg();

            default:
                throw new IllegalArgumentException("Tipo de taco não está no menu: "+ type);
        }
    }
}
