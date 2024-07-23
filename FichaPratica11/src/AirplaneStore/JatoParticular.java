package AirplaneStore;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatoParticular(String numSerie, String modelo, int anoFabrico, double peso, double comFuselagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria, ArrayList<Instalacao> instalacoes) {
        super(numSerie, modelo, anoFabrico, peso, comFuselagem, envAsas, altCauda, nMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = instalacoes;
    }
    public void addInstalacao(Instalacao instalacaoNova) {
        this.instalacoes.add(instalacaoNova);
    }

    public void removeInstalacao(Instalacao instalacaoRemover) {
        this.instalacoes.remove(instalacaoRemover);
    }

    public void exibirInstalacoes(){
        System.out.println("Instalações");
        System.out.println(this.instalacoes);
    }


}
