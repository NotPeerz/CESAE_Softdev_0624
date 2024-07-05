package FichaPratica03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        int numero, x = 0;
        String mensagem;

        System.out.println("Introduza a quantidade: ");
        numero = input.nextInt();

        System.out.println("Introduza uma mensagem");
        input.nextLine(); //Limpeza de Buffer
        mensagem = input.nextLine();


        while (x < numero) {
            System.out.println(mensagem);
            x++;

        }

    }}




