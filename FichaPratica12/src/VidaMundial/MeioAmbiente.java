package VidaMundial;

import java.util.ArrayList;

public class MeioAmbiente {
    private String nome;
    private double agua;//litros de agua no meio
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double agua, ArrayList<SerVivo> seres) {
        this.nome = nome;
        this.agua = agua;
        this.seres = seres;
    }

    boolean plantaBebe(int indexPlanta) {
        if (agua>1.350) { // se acontecer esta função, fazer a agua do meio ambiente abaixar.
            return true; // se retornar true, então a planta bebeu e agua do meio diminuiu.
        }
        if (agua<1.350) {
            return false; // se retornar false, a planta não bebe e seca(deve ser retirada do meio ambiente).
        }
        return true;
    }

    boolean plantaComeInsetos(int indexPlanta) { // a planta come um inseto e retorna true.
        if () {
        return true;
        }else{ //Caso não existam insetos, a planta morre de fome, é retirada do meio ambiente e a função retorna false.
            return false;
        }
    }

    public void plantaAbanaComVento(int indexPlanta) {
        System.out.println("Está muito vento");
    }

    public void animalFazBarulho(int indexAnimal) {
        System.out.println("Barulho do animal");
    }

}