package AirplaneStore;

public class Main {
    public static void main(String[] args) {

        JatoParticular cessna = new JatoParticular("J12345","Cessna 125",1990,850,12.5,6.75,2.3,2,2300,755,50980,21,300,CategoriaJato);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.TOMADAS);
        cessna.addInstalacao(Instalacao.WIFI);

        JatoParticular gulfstream = new JatoParticular("6222334","Gulfstream",2023,1200,19.9,7,,3.1,3,);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.WIFI);
        gulfstream.addInstalacao(Instalacao.TOMADAS);
        gulfstream.addInstalacao(Instalacao.COZINHA);
        gulfstream.addInstalacao(Instalacao.SUITE);

        JatoParticular boeing = new JatoParticular();
        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.WIFI);
        boeing.addInstalacao(Instalacao.ESCRITORIO);


        AviaoCombate f17 = new AviaoCombate("Us007","F17",2012,450,6.8,3.75,1.2,2,1650,1230,);
        f17.addArma(Arma.METRALHADORAS);
        f17.addArma(Arma.FOGUETES);
        f17.addArma(Arma.MISSEIS);
        f17.addArma(Arma.BOMBAS);

        AviaoCombate f22 = new AviaoCombate();
        f22.addArma(Arma.METRALHADORAS);

        Catalogo lojaAvioesXPTO = new Catalogo();
        lojaAvioesXPTO.comprarAviao(cessna);
        lojaAvioesXPTO.comprarAviao(gulfstream);
        lojaAvioesXPTO.comprarAviao(boeing);
        lojaAvioesXPTO.comprarAviao(f17);
        lojaAvioesXPTO.comprarAviao(f22);

    }
}
