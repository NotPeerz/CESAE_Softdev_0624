package Pizzaria;

import Pizzaria.Ingredientes.Ingrediente;

public class IngredientePizza {
    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhesIngredientePizza() {
        this.ingrediente.exibirDetalhesIngrediente();
        System.out.print(": " + this.quantidade);

        switch (this.ingrediente.getUnidadeMedida()){
            case Gramas:
                System.out.print(" g.");
                break;

            case Litros:
                System.out.print(" L.");
                break;

            case Unidades:
                System.out.print(" uni.");
                break;
        }
    }

}
