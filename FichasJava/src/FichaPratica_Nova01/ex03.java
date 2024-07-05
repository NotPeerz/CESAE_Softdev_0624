package FichaPratica_Nova01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int area, perimetro,largura, altura;

        System.out.println("Digite o valor da largura em cm: ");
        largura = input.nextInt();

        System.out.println("Digite o valor da alturaem cm: ");
        altura = input.nextInt();

        perimetro = (largura+largura + altura+altura);
        System.out.println("Perimetro: " + perimetro+"cm");

        area = (largura * altura)/2;
        System.out.println("Area: " + area+"cm");

    }
}
