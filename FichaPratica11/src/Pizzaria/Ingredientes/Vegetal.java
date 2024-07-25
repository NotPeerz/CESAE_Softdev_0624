package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoVegetal;
import Pizzaria.Enums.unidadeMedidaIngrediente;

public class Vegetal extends Topping{
    private TipoVegetal tipo;

    public Vegetal(int id, String nome, unidadeMedidaIngrediente unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
