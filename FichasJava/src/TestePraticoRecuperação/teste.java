package TestePraticoRecuperação;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int conta;
        double password = 4322;
        double saldoAtual = 0;
        double margemEmprestimo = 10 / 100;

        //Ler variaveis

        do {
            System.out.println("1. Conta, 2. Conta , 3. Conta.");

            System.out.println("Escolha uma conta");
            conta = input.nextInt();

            switch (conta) {
                case 1:
                    System.out.println("Você escolheu Conta 1");
                    System.out.println("Senha(4 digitos)");
                    password = input.nextDouble();
                    System.out.println("Bem vindo Enzo");
                    System.out.println("Numero da conta:234567 ");
                    System.out.println("Saldo: " + saldoAtual);
                    System.out.println("Margem de Empréstimo: " + margemEmprestimo);

                    break;
                case 2:
                    System.out.println("Você escolheu Conta 2");
                    System.out.println("Senha(4 digitos)");
                    password = input.nextDouble();
                    System.out.println("Bem vindo Lorenzo");
                    System.out.println("Numero da conta:123456 ");
                    System.out.println("Saldo: " + saldoAtual);
                    System.out.println("Margem de Empréstimo: " + margemEmprestimo);

                    break;
                case 3:
                    System.out.println("Você escolheu Conta 3");
                    System.out.println("Senha(4 digitos)");
                    password = input.nextDouble();
                    System.out.println("Bem vindo Ronaldo");
                    System.out.println("Numero da conta:345678 ");
                    System.out.println("Saldo: " + saldoAtual);
                    System.out.println("Margem de Empréstimo: " + margemEmprestimo);

                    break;
                default:


            }
        }while (conta <= 3);
    }
}
