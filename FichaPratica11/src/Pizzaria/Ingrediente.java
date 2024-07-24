package Pizzaria;
import Pizzaria.Enums.unidadeMedidaIngrediente;
public class Ingrediente {
    public String numeroIngrediente;
    private int id;
    private String nome;
    private unidadeMedidaIngrediente unidadeMedida;
    private double numCalorias;

    public Ingrediente(String numeroIngrediente,int id, String nome, unidadeMedidaIngrediente unidadeMedida, double numCalorias) {
        this.numeroIngrediente=numeroIngrediente;
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.numCalorias = numCalorias;
    }

    public int getId() {
        return id;
    }

    public double calcularNumCalorias() {
        this.numCalorias
        return numCalorias;
    }

    public void exibirDetalhesIngredientes() {
        System.out.print(this.numeroIngrediente);
        System.out.print(": [ " + this.id + " ");
        System.out.print("| " + this.nome + " ");
        System.out.print("| " + this.unidadeMedida + " ");
        System.out.print("| " + this.numCalorias + "Kcal ] :");
    }

}