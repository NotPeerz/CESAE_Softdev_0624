package Ex_02;

public class TacoFrango extends Taco{

    @Override
    public void Prepare() {
        System.out.println("Estamos preparando seu taco de carne de frango..." );
    }

    @Override
    public void Bake() {
        System.out.println("Estamos assando seu taco de carne de frango, segura a fome!");
    }

    @Override
    public void Box() {
        System.out.println("Estamos embalando seu taco de carne de frango..." );
        System.out.println("\n Se possivél avalie-nos.");
        System.out.println("\n 🌯🍗");
    }

}
