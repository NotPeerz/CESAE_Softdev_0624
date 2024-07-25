package VidaMundial;

import Enums.AlimentacaoDieta;

public class Animal extends SerVivo{
    private boolean fome;
    private double peso; //em kg
    private double inteligencia;//(0-100)
    private AlimentacaoDieta alimentacaoDieta;
    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, AlimentacaoDieta alimentacaoDieta, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.alimentacaoDieta = alimentacaoDieta;
        this.barulho = barulho;
    }

}
