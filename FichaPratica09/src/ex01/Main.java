package ex01;

public class Main {
    public static void main(String[] args) {
        Carro carro1=new Carro("Koenigsegg","Agera RS",2018,40,6,1360,1.9,TipoCombustivel.GASOLINA);
        Carro carro2= new Carro("Lamborghini","Urus",2024,30,0,800,1.6,TipoCombustivel.GASOLINA);
        Carro carro3= new Carro("Buggati","Chiron",2020,20, 4, 980, 3.0, TipoCombustivel.GPL);
        Carro carro4=new Carro("Mustang","hellcat",2017, 39, 7, 880, 4.0, TipoCombustivel.DIESEL);

        carro1.ligar();
        carro1.corrida(carro2);
        Carro vencedorCorrida1 = carro1.corrida(carro2);
        Carro vencedorCorrida2 = carro3.corrida(carro4);

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);

        vencedorFinal.exibirDetalhes();
    }
}
