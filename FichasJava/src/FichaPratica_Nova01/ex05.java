package FichaPratica_Nova01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1,num2,num3;
        int media, mediaPonderada;

        System.out.println("Escolha o primeiro valor: ");
        num1 = input.nextInt();

        System.out.println("Escolha o segundo valor: ");
        num2 = input.nextInt();

        System.out.println("Escolha o terceiro valor: ");
        num3 = input.nextInt();

        media = (num1 + num2 + num3) / 3;
        System.out.println("A media é: "+media);

        mediaPonderada = (media * 3) / 4;
        System.out.println("A media ponderada é: "+mediaPonderada);
    }
}
