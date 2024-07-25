package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoQueijo;
import Pizzaria.Enums.unidadeMedidaIngrediente;

public class Queijo extends Topping{
    private TipoQueijo tipo;

    public Queijo(int id, String nome, unidadeMedidaIngrediente unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}