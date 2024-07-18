package ex04;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1= new Circulo(40);
        Circulo circunferencia1= new Circulo(20);

        System.out.println("Área: " +circulo1.area() + " cm2");
        System.out.println("Circunferência: " +circunferencia1.circunferencia() + " cm");
    }
}
