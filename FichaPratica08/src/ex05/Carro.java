package ex05;
public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrica;
    public Carro (String marca, String modelo, int anoFabrica) {
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabrica=anoFabrica;
    }
    public void ligar(){
        System.out.println("O carro está ligado.");
    }
}
