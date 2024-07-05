package FichaPratica01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2, soma;

        // Ler num1
        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira outro numero: ");
        num2 = input.nextInt();

        // Soma num1 e num2
        soma = num1 + num2;

        //Apresentar o resultado
        System.out.println("Soma: " + soma);

    }
}
