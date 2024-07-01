package FichaPratica05;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int linhas=3;
        int colunas=5;
        int[][] matriz = new int[linhas][colunas];

        // Ler números inteiros do usuário e armazená-los na matriz.

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Insira na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir a matriz.

        System.out.println("Matriz 3x5:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t|\t");
            }
            System.out.println();
        }
        System.out.print("Insira um número para verificar: ");
        int numDeVerific;
        numDeVerific = input.nextInt();
        int count = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == numDeVerific) {
                    count++;
                }
            }
        }
        System.out.println("O número "+numDeVerific+" se repete "+count+" vezes na matriz.");
    }
}
