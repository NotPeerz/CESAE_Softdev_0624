package FichaPratica04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis.

        int num, palpite,tentativas=0;
        System.out.println("Jogador 1 - Escolha um número de 0 a 100: ");
        num = input.nextInt();

        do {
            System.out.print("Jogador 2 - De um palpite:  ");
            palpite = input.nextInt();

            tentativas++;

            if (palpite > num) {
                System.out.println("Errou, o número é menor");
            }

            if (palpite < num) {
                System.out.println("Errou, o número é maior");
            }
        } while (palpite != num) ;
            System.out.println("Parabéns, você acertou! " + tentativas + " tentativas");
    }
}
