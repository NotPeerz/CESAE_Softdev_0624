package FichaPratica02Nova;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, imposto;
        System.out.println("Introduza um salario: ");
        salario= input.nextDouble();

        if (salario<=15000) {
            imposto=salario*0.2;
            System.out.println("Paga taxa de: "+imposto+"%");

        }
    }
}
