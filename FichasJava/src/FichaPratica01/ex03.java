package FichaPratica01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        //Inport Scanner

        Scanner input = new Scanner(System.in);

        //Declarar variaveis

        int num1, num2, multiplicacao;

        System.out.println("Digita o primeiro numero");
        num1 = input.nextInt();
        System.out.println("Digita o segundo numero");
        num2 = input.nextInt();
        System.out.println("multiplicaçao");
        //Apresentar o resultado

        multiplicacao = num1 * num2;
        System.out.println(multiplicacao);

        int num3, num4;
        System.out.println("Digite o terceiro numero");
        num3 = input.nextInt();
        System.out.println("Digite o quarto numero");
        num4 = input.nextInt();
        int soma =num1 + num2 + num3 +num4;
        System.out.println("soma");
        System.out.println(soma);



    }
}
