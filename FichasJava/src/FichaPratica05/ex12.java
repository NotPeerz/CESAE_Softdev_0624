package FichaPratica05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] vetor1 = new int[10];
        int [] vetor2 = new int[10];
        int[][] matriz = new int[2][2];

        // Ler vetor1

        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Insira no vetor1[" + i + "]: ");
                vetor1[i] = input.nextInt();
            }
        }
        //Ler vetor2
        for (int i = 0; i < vetor2.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Insira no vetor1[" + i + "]: ");
                vetor2[i] = input.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            matriz[linha][0] =vetor1[linha];
            matriz[linha][1] =vetor2[linha];
        }
        // Imprimir a matriz.
        System.out.println("Matriz 10x2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t|\t");
            }
            System.out.println();
        }
    }
}
