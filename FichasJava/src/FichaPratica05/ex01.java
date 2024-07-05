package FichaPratica05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int [] vetor = new int [10];

        //Ler vetor
        //No lugar do i < 10 também pode ser "length"
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println("\n_________________________________\n");

        //Imprimir vetor
        for (int i = 0; i < vetor.length;i++) {
            System.out.println("vetor["+i+"] = " +vetor[i]);
        }
    }
}
