package AirplaneStore;

public class Aviao {
    protected String numSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double comFuselagem;
    private double envAsas;
    private double altCauda;
    private int nMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    public Aviao(String numSerie, String modelo, int anoFabrico, double peso, double comFuselagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comFuselagem = comFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

}
