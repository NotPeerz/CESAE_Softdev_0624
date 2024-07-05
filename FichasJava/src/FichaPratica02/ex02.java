package FichaPratica02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double salario,imposto;


        //Ler salario
        System.out.println("Introduza um salario: ");
        salario=input.nextDouble();

        if (salario<=15000){
            imposto=salario*0.2;
            System.out.println("paga taxa de 20%"+imposto);


        } else {
            imposto=salario*0.3;
            System.out.println("paga taxa de 30%"+imposto);
        }












    }
}