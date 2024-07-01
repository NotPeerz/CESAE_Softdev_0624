package FichaPratica05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        // Ler números inteiros do usuário e armazená-los na matriz.

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Insira na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir a matriz.

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t|\t");
            }
            System.out.println();
        }
        int numMaior, numMenor;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == numMaior) {
                    System.out.println("O número maior é: " + numMaior);
                }
                    if (matriz[i][j] == numMenor) {
                        System.out.println("O número menor é: " + numMenor);


                    }
                }
            }
        }
    }
}
