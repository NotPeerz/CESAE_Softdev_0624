package Pizzaria;
import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.*;
import Pizzaria.Ingredientes.Base;
import Pizzaria.Ingredientes.Carne;
import Pizzaria.Ingredientes.Queijo;
import Pizzaria.Ingredientes.Vegetal;

public class Main {
    public static void main(String[] args) {
        Vegetal molhoTomate = new Vegetal(50, "Molho Tomate", unidadeMedidaIngrediente.Litros, 150, OrigemIngrediente.NACIONAL, TipoVegetal.TOMATE);
        Vegetal azeitonaPreta = new Vegetal(51, "Azeitona Preta", unidadeMedidaIngrediente.Unidades, 1.5, OrigemIngrediente.NACIONAL, TipoVegetal.AZEITONA);
        Queijo queijoMozzarela = new Queijo(60, "Queijo Mozzarela Italiano", unidadeMedidaIngrediente.Gramas, 2, OrigemIngrediente.IMPORTADO, TipoQueijo.MOZZARELA);
        Vegetal cogumelosFrescos = new Vegetal(53, "Cogumelos Frescos", unidadeMedidaIngrediente.Unidades, 2.5, OrigemIngrediente.NACIONAL, TipoVegetal.COGUMELOS);
        Carne pepperoni = new Carne(57, "Pepperoni", unidadeMedidaIngrediente.Unidades, 10, OrigemIngrediente.IMPORTADO, TipoCarne.PEPPERONI);
        Vegetal cebolaRoxa = new Vegetal(59, "Cebola Roxa", unidadeMedidaIngrediente.Gramas, 0.5, OrigemIngrediente.NACIONAL, TipoVegetal.CEBOLA);

        Base baseFina = new Base(99, "Base Fina Italiana", 1, TipoBase.Massa_Fina, "Clássica");
        Base baseAlta = new Base(100, "Base Alta Americana", 1.5, TipoBase.Massa_Alta, "Invenções Americanas");

        Pizza pizza4EstacoesGrande = new Pizza(1, "Pizza 4 Estações", "Inverno, Primavera, Verão, Outono", 15, TamanhoPizza.Grande);
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(baseFina, 100));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(molhoTomate, 0.2));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(azeitonaPreta, 20));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(queijoMozzarela, 200));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(cogumelosFrescos, 12));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(pepperoni, 6));


        Pizza pizzaQueijoFiambreMedia = new Pizza(2, "Pizza Fiambre e Queijo", "Básico não falha", 8, TamanhoPizza.Media);
        pizzaQueijoFiambreMedia.addIngredientePizza(new IngredientePizza(baseAlta, 75));
        pizzaQueijoFiambreMedia.addIngredientePizza(new IngredientePizza(molhoTomate, 0.1));
        pizzaQueijoFiambreMedia.addIngredientePizza(new IngredientePizza(queijoMozzarela, 150));
        pizzaQueijoFiambreMedia.addIngredientePizza(new IngredientePizza(baseAlta, 75));


        pizza4EstacoesGrande.exibirDetalhesPizza();
        System.out.println("\n");
        pizzaQueijoFiambreMedia.exibirDetalhesPizza();
    }
}
