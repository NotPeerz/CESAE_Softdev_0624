package FichaPratica01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        //Inport Scanner

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double a1, a2, a3, media;

        // ler a1

        System.out.print("Digite o primeiro valor: ");
        a1 = input.nextDouble();

        // ler a2

        System.out.print("Digite o segundo valor: ");
        a2 = input.nextDouble();

        // ler a3

        System.out.print("Digite o terceiro valor: ");
        a3 = input.nextDouble();

        //calcular a1+a2+a3/3

        media=(a1+a2+a3)/3;

        //Apresentar o resultado
        System.out.print(media);


        int mediaponderada;
        System.out.print();




    }
}
