package ex01;

public class MainStand {
    public static void main(String[] args) {

        Carro carro1=new Carro("Koenigsegg","Agera RS",2018,40,6,1360,1.9,TipoCombustivel.GASOLINA);
        Carro carro2= new Carro("Lamborghini","Urus",2024,30,0,800,1.6,TipoCombustivel.GASOLINA);
        Carro carro3= new Carro("Buggati","Chiron",2020,20, 4, 980, 3.0, TipoCombustivel.GPL);
        Carro carro4=new Carro("Mustang","hellcat",2017, 39, 7, 880, 4.0, TipoCombustivel.DIESEL);

        Stand standEsquina = new Stand("Stand XPTO","Esquina",15);

        standEsquina.addCarro(carro1);
        standEsquina.addCarro(carro2);
        standEsquina.addCarro(carro3);
        standEsquina.addCarro(carro4);

        standEsquina.imprimirCatalogo();

    }

}
