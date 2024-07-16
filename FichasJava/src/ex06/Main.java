package ex06;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();

        System.out.println("A Soma é: "+calculadora.soma(10,5));
        System.out.println("A Subtração é: "+calculadora.sub(50,2));
        System.out.println("A Divisão é: "+calculadora.div(30,3));
        System.out.println("A Multiplicação é: "+calculadora.mult(10,10));
    }
}
