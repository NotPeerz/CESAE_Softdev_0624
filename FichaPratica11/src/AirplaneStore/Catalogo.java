package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> listaAvioes;

    public Catalogo(ArrayList<Aviao> listaAvioes) {
        this.listaAvioes = listaAvioes;
    }
    public Catalogo() {
        this.listaAvioes = new ArrayList<Aviao>();
    }
public void comprarAviao(Aviao aviaoNovo) {

}
    public void venderAviao(Aviao aviaoVendido) {
        this.listaAvioes.remove(aviaoVendido);
    }
}
