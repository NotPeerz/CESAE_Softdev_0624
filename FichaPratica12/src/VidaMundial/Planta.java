package VidaMundial;

import Enums.Familia;

public class Planta extends SerVivo {
    private Familia familia;
    private int GrauDefesa;// sendo 0 a inexistencia de um mecanismo de defesa e 5 como defesa muito boa (0=5).

    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        GrauDefesa = grauDefesa;
    }

}