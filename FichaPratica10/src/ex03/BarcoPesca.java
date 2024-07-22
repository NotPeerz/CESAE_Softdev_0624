package ex03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome,cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCargaKg;
    private Marca marcaBarco;
    private ArrayList<BarcoPesca>peixesPescados;
    private ArrayList<BarcoPesca>mariscosPescados;
    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCargaKg, Marca marcaBarco, ArrayList<BarcoPesca> peixesPescados, ArrayList<BarcoPesca> mariscosPescados) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marcaBarco = marcaBarco;
        this.peixesPescados = peixesPescados;
        this.mariscosPescados = mariscosPescados;
    }

    public double calcularCargaAtual(){
        double cargaAtual=0;

        for (Peixe peixeAtual: this.peixesPescados){
            cargaAtual+=peixeAtual.getPeso();
        }
        for (Marisco mariscoAtual: this.mariscosPescados){
            cargaAtual+=mariscoAtual.getPeso();
        }
        return cargaAtual;
    }
    public void addPeixe(Peixe peixeNovo){
        if (this.calcularCargaAtual()+ peixeNovo.getPeso()<=this.capacidadeCargaKg){
            this.peixesPescados.add(peixeNovo);
        }
    }

    public void addMarisco(Marisco mariscoNovo){
        if (this.calcularCargaAtual()+ mariscoNovo.getPeso()<=this.capacidadeCargaKg){
            this.peixesPescados.add(mariscoNovo);
        }
    }




}