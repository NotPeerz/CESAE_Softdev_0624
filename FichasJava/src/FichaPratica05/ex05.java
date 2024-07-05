package FichaPratica05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double [] vetor = new double [11];
        double soma=0;
        double media;
        //Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            vetor[i] = input.nextDouble();
        }
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];

        }
        media= soma/ vetor.length;
        System.out.print("A media é: "+media);
    }
}
