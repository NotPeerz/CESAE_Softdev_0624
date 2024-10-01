package Ex_02;

public class TacoVeg extends Taco{
    @Override
    public void Prepare() {
        System.out.println("Estamos preparando seu taco vegetariano..." );
    }

    @Override
    public void Bake() {
        System.out.println("Estamos assando seu taco vegetariano, segura a fome!");
    }

    @Override
    public void Box() {
        System.out.println("Estamos embalando seu taco vegetariano..." );
        System.out.println("\n Se possivél avalie-nos.");
        System.out.println("\n 🌯🥬");
    }

}
