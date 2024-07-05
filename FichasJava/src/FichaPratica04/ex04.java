package FichaPratica04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis.

        int numero;

        boolean primo=true;

        //ler numero

        System.out.println("Introduza um número");
        numero=input.nextInt();

        for (int divisor = 2;divisor<numero;divisor++){
            if (numero % divisor == 0) {
                primo = false;
                break;
            }
        }

        if (primo){
            System.out.println("Primo");
        }else{
            System.out.println("Não primo");
        }
    }
}
