package ex01;

public class Main {
    public static void main(String[] args) {
        Carro koenigseggAgeraRs=new Carro("Koenigsegg","Agera RS",2018,40,6,1360,1.9,TipoCombustivel.GASOLINA);
        Carro lamborghiniUrus= new Carro("Lamborghini","Urus",2024,30,0,800,1.6,TipoCombustivel.GASOLINA);
        koenigseggAgeraRs.ligar();
        koenigseggAgeraRs.corrida(lamborghiniUrus);

    }
}
