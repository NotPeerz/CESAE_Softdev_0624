package FichaPratica05;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
// Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler 9 números inteiros do usuário e armazená-los na matriz.

        System.out.println("Por favor, insira 9 números inteiros:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        // Imprimir a matriz.

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"\t|\t");
            }
            System.out.println();
        }
    }
}