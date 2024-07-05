package FichaPratica03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {


        //Inport Scanner
        Scanner input = new Scanner(System.in);


        int inicio=0, fim, salto=5;

        System.out.println("Digita o fim: ");
        fim=input.nextInt();



        while(inicio<=fim) {
            System.out.println(inicio);

            inicio = inicio + salto;

        }
        }
    }

