package FichaPratica_Nova01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1,num2, soma;

        System.out.println("Escolha um numero: ");
        num1 = input.nextInt();
        System.out.println("Escolha um outro numero: ");
        num2 = input.nextInt();
        soma = num1 + num2;
        System.out.println("A soma é: "+soma);


    }
}
