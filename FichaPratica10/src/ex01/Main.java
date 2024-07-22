package ex01;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("lalala","Rock","Robson",150);
        Musica musica2 = new Musica("lelele","POP","João",170);
        Musica musica3 = new Musica("lilili", "Trap","Matheus",180);
        Musica musica4 = new Musica("lololo","Deep House","Sérgio",200);
        Musica musica5 = new Musica("lululu","RAP","Eminem",210);

        MusicPlayer playlist = new MusicPlayer();

        playlist.addMusica(musica1);
        playlist.addMusica(musica2);
        playlist.addMusica(musica3);
        playlist.addMusica(musica4);
        playlist.addMusica(musica5);

        playlist.imprimirRelatorio();

        playlist.trocarMusica(1,musica5);
        playlist.trocarMusica(4,musica2);
        playlist.imprimirRelatorio();

        playlist.calcularDuracao();



    }
}