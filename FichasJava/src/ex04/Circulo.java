package ex04;

public class Circulo {
    private double raio;
    private double pi=3.14;
    public Circulo(double raio) {
        this.raio=raio;
    }
    public double area(){
        return this.pi*this.raio*this.raio;
    }
    public double circunferencia() {
        return this.pi*2*this.raio;
    }

}
