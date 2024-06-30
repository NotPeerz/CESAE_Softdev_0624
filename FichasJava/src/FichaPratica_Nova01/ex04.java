package FichaPratica_Nova01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis

        double  pi, raio, circunferencia;

        System.out.print("Digite o valor do raio: ");
        raio = input.nextInt();
        pi=3.14;
        circunferencia= raio*pi;

        System.out.println("O valor da circunferência é: "+circunferencia);


    }
}
