package Ex_03;

public abstract class Doc {
    protected String autor;
    protected String nome;
    protected String extensao;

    public Doc(String autor, String extensao, String nome) {
        this.autor = autor;
        this.extensao = extensao;
        this.nome = nome;
    }
    public abstract void open();

    public abstract void save();

    public abstract void close();

}
