package ex02;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("12345", "Enzo", 1000,2023,0.9,9);
        Conta conta2 = new Conta("11122", "Arthur", 300,2023,0.9,9);
        Conta conta3 = new Conta("991122", "Sérgio", 500,2023,0.9,9);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.depositar(1000);
        conta3.depositar(120);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.levantar(1500);
        conta2.levantar(2500);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.transferir(500, conta2);
        conta3.transferir(3000,conta1);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.emprestimo(800);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");




    }
    }