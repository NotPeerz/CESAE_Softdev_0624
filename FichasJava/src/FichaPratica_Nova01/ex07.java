package FichaPratica_Nova01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double produto1, produto2, produto3, precoTotal, precoDesconto, desconto;

        System.out.print("Digite o valor do produto1: ");
        produto1 = input.nextDouble();

        System.out.print("Digite o valor do produto2: ");
        produto2 = input.nextDouble();

        System.out.print("Digite o valor do produto3: ");
        produto3 = input.nextDouble();

        precoTotal = produto1 + produto2 + produto3;
        System.out.println("O preço total é: "+precoTotal);

        precoDesconto = precoTotal * 10/100;
        System.out.println("O preço com desconto é: "+(precoTotal-precoDesconto));
    }
}
