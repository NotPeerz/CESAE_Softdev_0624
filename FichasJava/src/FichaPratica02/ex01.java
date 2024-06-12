package FichaPratica02;

import java.awt.*;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);


        //Apresente o problema
        int num1, num2 ;

        //Ler num1
        System.out.println("Insira num1: ");
        num1=input.nextInt();

        //Ler num2
        System.out.println("Insira num2: ");
        num2=input.nextInt();

        if(num1>=num2){System.out.println(num1);}

        if(num2>=num1){System.out.println(num2);}


    }
}