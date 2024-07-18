package ex09;

public class Produto {
    private String nome;
    private double preco;
    private int quantStock=0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void comprar(int quantidadeCompra) {
        this.quantStock +=quantidadeCompra;
    }

    public void exibirDetalhes(){
        System.out.println("Produto: "+ this.nome + "\t Preço"+ this.preco+ "\t QuantStock");
    }

}
