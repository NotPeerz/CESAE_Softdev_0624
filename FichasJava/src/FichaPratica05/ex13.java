package FichaPratica05;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int somatorio=0;

        // Ler matriz.

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        // Imprimir a matriz.

        System.out.println("Matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz[linha][coluna]+"\t|\t");
            }
            System.out.println();
        }
        //Encontrar o somatorio da dioganal.

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {

                if (linha==coluna) {
                    somatorio=somatorio+matriz[linha][coluna];
                }
            }
            }
        System.out.println("Somatorio da diagonal principal é: "+somatorio);
    }
}

