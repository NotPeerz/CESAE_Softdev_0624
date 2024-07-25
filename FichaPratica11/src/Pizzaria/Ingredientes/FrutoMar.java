package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoFrutoMar;
import Pizzaria.Enums.unidadeMedidaIngrediente;

public class FrutoMar extends Topping{

    private TipoFrutoMar tipo;

    public FrutoMar(int id, String nome, unidadeMedidaIngrediente unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
