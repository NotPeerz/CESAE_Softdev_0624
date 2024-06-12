package FichaPratica01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //Inport Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;
        System.out.print("Digite um numero: ");
        num1 = input.nextInt();

        System.out.print("Digite um numero: ");

        num2 = input.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        //Apresentar resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);




    }
}
