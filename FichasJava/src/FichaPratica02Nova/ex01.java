package FichaPratica02Nova;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.println("Introduza outro numero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        }else{
            System.out.println(num2);
    }
}
}
