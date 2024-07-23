package AirplaneStore;

import java.util.ArrayList;

public class AviaoCombate {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(String paisOrigem, boolean camuflagem, ArrayList<Arma> arsenal) {
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = arsenal;
    }
public void addArma(Arma armaNova){
        if (this.arsenal.size()<3) {
            this.arsenal.add(armaNova);
        }
    }
    public void removeArma(Arma armaRemover) {
        System.out.println("Arsenal");
        System.out.println(this.arsenal);
    }
}
