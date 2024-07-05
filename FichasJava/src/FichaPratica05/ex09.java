package FichaPratica05;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[5][5];
        int somatorio = 0;

        // Ler números inteiros do usuário e armazená-los na matriz.

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Insira na matriz["+i+"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir a matriz.
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t|\t");
                somatorio = somatorio + matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("Somatorio: "+somatorio);
    }
}
