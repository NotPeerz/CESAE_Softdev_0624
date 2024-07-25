package Pizzaria.Ingredientes;
import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoCarne;
import Pizzaria.Enums.unidadeMedidaIngrediente;

public class Carne extends Topping{
    private TipoCarne tipo;

    public Carne(int id, String nome, unidadeMedidaIngrediente unidadeMedida, double calorias, OrigemIngrediente origem, TipoCarne tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}