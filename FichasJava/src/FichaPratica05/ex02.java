package FichaPratica05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int [] vetor = new int [13];
        int soma=0;
        //Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Comissão mensal["+i+"]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];

        }
        System.out.println("Comissão anual: " + soma);
    }
}
