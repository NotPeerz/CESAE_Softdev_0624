package FichaPratica05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int menor, maior;

        // Ler números inteiros do usuário e armazená-los na matriz.

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Insira na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir a matriz.

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t|\t");
            }
            System.out.println();
        }
        maior=matriz[3][3];
        menor=matriz[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor) {
                    menor=matriz[i][j];
                    System.out.println("O número menor é: " + menor);
                }
                    if (matriz[i][j] > maior) {
                        maior=matriz[i][j];
                        System.out.println("O número menor é: " + maior);

                    }
            }
        }
    }
}

