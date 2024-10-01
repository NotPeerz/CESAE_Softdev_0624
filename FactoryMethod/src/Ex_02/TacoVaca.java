package Ex_02;

public class TacoVaca extends Taco{

    @Override
    public void Prepare() {
        System.out.println("Estamos preparando seu taco de carne de vaca..." );
    }

    @Override
    public void Bake() {
        System.out.println("Estamos assando seu taco de carne de vaca, segura a fome!");
    }

    @Override
    public void Box() {
        System.out.println("Estamos embalando seu taco de carne de vaca..." );
        System.out.println("\n Se possivél avalie-nos.");
        System.out.println("\n 🌯🍖");
    }
}
