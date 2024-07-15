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
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setAnoFabrica(int anoFabrica){
        this.anoFabrica=anoFabrica;
    }

}
