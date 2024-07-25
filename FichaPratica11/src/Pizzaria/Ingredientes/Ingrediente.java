package Pizzaria.Ingredientes;
import Pizzaria.Enums.unidadeMedidaIngrediente;
public class Ingrediente {
    private int id;
    private String nome;
    private unidadeMedidaIngrediente unidadeMedida;
    private double numCalorias;

    public Ingrediente(int id, String nome, unidadeMedidaIngrediente unidadeMedida, double numCalorias) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.numCalorias = numCalorias;
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public unidadeMedidaIngrediente getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getCalorias() {
        return numCalorias;
    }

    public void exibirDetalhesIngrediente() {
        System.out.print("[ " + this.id + " ");
        System.out.print("| " + this.nome + " ");
        System.out.print("| " + this.unidadeMedida + " ");
        System.out.print("| " + this.numCalorias + "Kcal ] :");
    }

}