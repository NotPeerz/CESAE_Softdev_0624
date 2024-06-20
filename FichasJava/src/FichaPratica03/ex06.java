package FichaPratica03;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        int  inicio,fim;

        System.out.println("Digite um número de início : ");
        inicio =input.nextInt();
        System.out.println("Digite um número de fim : ");
        fim=input.nextInt();


        while(inicio<=fim) {
            System.out.println(inicio);
            inicio = inicio + 1;
        }

    }
}
