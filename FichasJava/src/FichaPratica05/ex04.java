package FichaPratica05;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        //Inport Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int [] vetor = new int [11];
        int menor;

        //Ler vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            vetor[i] = input.nextInt();
        }

        menor=vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        System.out.println("Menor: "+menor);
    }
    }
