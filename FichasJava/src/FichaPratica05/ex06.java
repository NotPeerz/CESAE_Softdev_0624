package FichaPratica05;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int [] vetor = new int [11];
        int antecessor;
        boolean crescente=true;

        //Ler vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            vetor[i] = input.nextInt();
        }
        //Ler o antecessor
        antecessor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]<antecessor){
                antecessor = vetor[i];
                crescente=false;
            }
        }
        if (crescente){
            System.out.println("Ordem crescente");

        }else
            System.out.println("Ordem não crescente");
    }
}
