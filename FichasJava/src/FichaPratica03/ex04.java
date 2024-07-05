package FichaPratica03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        int x=1,numero;

        System.out.println("Digite um número : ");
       numero =input.nextInt();

        while(x<=numero){
            System.out.println(x);
            x = x +1;



    }
}}