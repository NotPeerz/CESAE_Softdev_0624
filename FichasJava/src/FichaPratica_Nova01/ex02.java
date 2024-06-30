package FichaPratica_Nova01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1,num2, soma, sub, div, mult;

        System.out.println("Escolha um número: ");
        num1 = input.nextInt();
        System.out.println("Escolha outro nnúmero: ");
        num2 = input.nextInt();
        soma = num1 + num2;
        System.out.println("A soma é: "+soma);
        sub = num1 - num2;
        System.out.println("A subtração é: "+sub);
        div = num1 / num2;
        System.out.println("A divisão é: "+ div);
        mult = num1 * num2;
        System.out.println("A multiplicação é: "+ mult);

    }
}
