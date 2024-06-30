package FichaPratica_Nova01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        System.out.print("Digite um valor: ");
        valor1 = input.nextInt();

        System.out.print("Digite outro valor: ");
        valor2 = input.nextInt();

        System.out.println("Invertendo os valores agora...");

        System.out.println("valor 1: " + valor2);
        System.out.println("valor 2: " + valor1);
    }
}
