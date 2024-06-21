package FichaPratica03;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, numcortado, numadicionado;

        System.out.println("Introduza um numero: ");
        num = input.nextInt();
        numcortado = num - 5;
        numadicionado = num + 5;

        while (num > numcortado) {
            System.out.println(numcortado);
            numcortado = numcortado + 1;
        }

        while (numadicionado>=num) {
            System.out.println(num);
            num = num + 1;






        }
    }
}
