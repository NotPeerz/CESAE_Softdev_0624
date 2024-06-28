package FichaPratica05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int [] vetor = new int [11];

        //Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            vetor[i] = input.nextInt();

        }
    }
}
