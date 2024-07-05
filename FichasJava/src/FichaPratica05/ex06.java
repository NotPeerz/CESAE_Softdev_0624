package FichaPratica05;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[] vetor = new int[11];
        boolean crescente = true;

        //Ler vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }


        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <=vetor[i-1]){
                crescente = false;
            }
        }
        if (crescente) {
            System.out.println("Ordem crescente");

        } else {
            System.out.println("Ordem não crescente");
        }
    }
}