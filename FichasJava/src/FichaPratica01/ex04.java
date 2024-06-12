package FichaPratica01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        //Inport Scanner

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double raio, area;


        // ler raio
        System.out.print("Digite um numero: ");
        raio = input.nextDouble();

        // calcular area
        area=3.14*raio*raio;

        //Apresentar o resultado
        System.out.print("Olá! A área é "+area+" m2");


    }
}
