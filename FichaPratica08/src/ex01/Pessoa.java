package ex01;

public class Pessoa {
    private String nome;
    private int indade;
    private double altura;



    public Pessoa(String nome, int idade, double altura) {
        this.nome=nome;
     //   this.idade=idade;
        this.altura=altura;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIndade() {
        return indade;
    }
    public double getAltura() {
        return this.altura;
    }
}