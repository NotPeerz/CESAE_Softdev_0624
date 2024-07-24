package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {
    private final int limiteIngrediente = 5;
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanhoPizzas;
    private ArrayList<IngredientePizza> composicaoPizza;

    public Pizza(String codigo, String nome, String descricao, double preco, TamanhoPizza tamanhoPizzas) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanhoPizzas = tamanhoPizzas;
        this.composicaoPizza = new ArrayList<IngredientePizza>();
    }

    public void addIngrediente(IngredientePizza ingredienteNovo) {
        if (this.composicaoPizza.size() < this.limiteIngrediente) {
            this.composicaoPizza.add(ingredienteNovo);
        }
    }

    public void removeIngrediente(IngredientePizza ingredienteRemover) {
        for (int i = 0; i < this.composicaoPizza.size(); i++){
            this.composicaoPizza.remove(ingredienteRemover.getIngrediente().getId());
        }
    }

    public

    public int calcularCaloriasPizza(IngredientePizza calculoCaloria) {
        int calculoCaloria=0;
        for (){
            this.composicaoPizza.(calculoCaloria.getIngrediente().getNumCalorias());
        } return calculoCaloria;
    }

    public void exibirDetalhesPizza() {
        System.out.println("*****" + this.nome + "*****");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanhoPizzas);
    }

    public void ingredienteContar() {
        for (int i = 0; i < this.composicaoPizza.size(); i++) {
            System.out.println("Ingrediente " + (i + 1) + ": ");
            this.composicaoPizza.get(i).exibirDetalhes();

        }
    }

}
