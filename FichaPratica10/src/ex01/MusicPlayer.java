package ex01;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;
    public MusicPlayer() {
        this.programacao=new ArrayList<Musica>();
    }

    public void addMusica(Musica musicaNova) {
        this.programacao.add(musicaNova);
    }

    public void trocarMusica(int indexTrocar, Musica musicaTrocada){
       this.programacao.set(indexTrocar,musicaTrocada);
    }

    public void removerMusica( Musica musicaRemovida){
        this.programacao.remove(musicaRemovida);
    }

    public void imprimirRelatorio(){
        System.out.println("****** Lista de Músicas ******");
        for (int i=0; i<this.programacao.size(); i++) {
            System.out.print("Música "+ (i+1)+ " : ");
            this.programacao.get(i).exibirRelatorio();
        }
    }

    public void limprPrograma(){
        this.programacao.clear();
    }

    public void calcularDuracao(){
        int totalSegundosAlbum=0;

        for (Musica musicaAtual: this.programacao){
            totalSegundosAlbum+=musicaAtual.getDuracaoSegundos();
        }
        int horas, minutos, segundos;

        horas= totalSegundosAlbum/ 3600;
        minutos= totalSegundosAlbum/60 -(horas*60);
        segundos=totalSegundosAlbum-(horas*3600)-(minutos*60);

        System.out.println("Duração: "+horas+":"+minutos+":"+segundos);
    }
}