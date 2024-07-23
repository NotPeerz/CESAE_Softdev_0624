package Pizzaria;
public class IngredientePizza {
    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        this.ingrediente.exibirDetalhesIngredientes();
        System.out.println(this.quantidade);
    }

}
