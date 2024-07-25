package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.unidadeMedidaIngrediente;

public class Topping extends Ingrediente{
    private OrigemIngrediente origem;

    public Topping(int id, String nome, unidadeMedidaIngrediente unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(id, nome, unidadeMedida, calorias);
        this.origem = origem;
    }
}