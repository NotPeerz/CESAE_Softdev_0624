package FichaPratica04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis e Strings.
        String caracter, continuar;

        double num1=0, num2=0,resultado=0;

        //Executar os comandos.
        do {

            //Ler variaveis.
            System.out.print("Decida um valor: ");
            num1 = input.nextDouble();

            System.out.print("Decida outro valor: ");
            num2 = input.nextDouble();

            System.out.print("Decida um caracter (+,-,*,/): ");
            caracter = input.next();

            switch(caracter) {

                case "+":
                    System.out.println("Soma: "+ (num1 +num2));
                    break;

                case "-":
                    System.out.println("Subtração: "+ (num1 -num2));
                    break;

                case "*":
                    System.out.println("Multiplicação: "+ (num1 *num2));
                    break;

                case "/":
                    System.out.println("Divisão: "+ (num1 /num2));
                default:

            }

            System.out.println("Deseja continuar?(introduza s/n): ");
            continuar = input.next();

        } while(continuar.equals("s")); // continuar=="s"







    }
}
