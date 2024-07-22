package ex01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String genero, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }
    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public void exibirRelatorio() {
        System.out.println("" + this.titulo + " | Gênero: " + this.genero + " | Artista: " + this.artista + " | Duração: " + this.duracaoSegundos);
    }

}