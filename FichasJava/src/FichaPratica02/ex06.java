package FichaPratica02;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis

        int num1, num2;

        //Ler num1
        System.out.println("Digita um numero");
        num1 = input.nextInt();

        //Ler num2
        System.out.println("Digita outro numero");
        num2 = input.nextInt();


        if (num1 > num2) {
            System.out.println(num1+" "+num2);
        } else {
            System.out.println(num2+" "+num1);



        }




    }
}