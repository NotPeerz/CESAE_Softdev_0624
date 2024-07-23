package Pizzaria;
import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.unidadeMedidaIngrediente;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("P1991","Pizza Portugal","Pizza tradicional com ingredientes nacionais que promete levar quem a come\nnuma viagem pela cultura de Portugal",19.90,TamanhoPizza.Grande);
        pizza1.exibirDetalhesPizza();

        Ingrediente ingrediente1 = new Ingrediente(19922,"Massa Alta", unidadeMedidaIngrediente.Gramas,1.5);
        Ingrediente ingrediente2 = new Ingrediente(13476,"Queijo de Cabra",unidadeMedidaIngrediente.Gramas,2.8);
        Ingrediente ingrediente3 = new Ingrediente(14445,"Rodela Chouriça de Mirandela",unidadeMedidaIngrediente.Unidades,35);
        Ingrediente ingrediente4 = new Ingrediente(10015,"Molho Tomate",unidadeMedidaIngrediente.Litros,325);
        Ingrediente ingrediente5 = new Ingrediente(10900,"Fatia Pimento Verde",unidadeMedidaIngrediente.Unidades,4);

        pizza1.addIngrediente(new IngredientePizza(ingrediente1,200));
        pizza1.addIngrediente(new IngredientePizza(ingrediente2,75));
        pizza1.addIngrediente(new IngredientePizza(ingrediente3,35));
        pizza1.addIngrediente(new IngredientePizza(ingrediente4,0.09));
        pizza1.addIngrediente(new IngredientePizza(ingrediente5,6));

        ingrediente1.exibirDetalhesIngredientes();
        System.out.println();
        ingrediente2.exibirDetalhesIngredientes();
        System.out.println();
        ingrediente3.exibirDetalhesIngredientes();
        System.out.println();
        ingrediente4.exibirDetalhesIngredientes();
        System.out.println();
        ingrediente5.exibirDetalhesIngredientes();

    }
}
