package TestePraticoRecuperacaoPce;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class recPce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        boolean admin = true;
        String pass="admin123";

        //Admin
        Scanner input = new Scanner(System.in);
        System.out.println("1. admin ou 2. cliente?");
        opcao=scanner.nextInt();
        do {
            if (admin) {
                System.out.println("Você escolheu Admin.");

                //Mostrar opções do menu ADMIN.

                System.out.println("\n***** Bem vindo ao banco, ADMIN! *****");
                System.out.println("1. Consulta Informações");
                System.out.println("2. Modificar Margem de Empréstimo");
                System.out.println("3. Logout");
                opcao=scanner.nextInt();
                switch (opcao) {
                    case 1: // Consulta as informações
                        System.out.println("Informações");
                        //puxar função da matriz com os 5 dados das 4 contas. (matriz completa!)!
                        int a, b, c, d, e, f, g, h, i, j, k, l;

                        a = 12345;
                        b = 11111;
                        c = 22222;
                        d = 33333;
                        e = 0;
                        f = 0;
                        g = 0;
                        h = 0;
                        i = 10;
                        j = 10;
                        k = 10;
                        l = 10;
                        System.out.println(a + " " + "Joaquim" + " " + "Quim85" + " " + e + " " + i);
                        System.out.println(b + " " + "Fernando" + " " + "Nando92" + " " + f + " " + j);
                        System.out.println(c + " " + "David Martins" + " " + "David!5" + " " + g + " " + k);
                        System.out.println(d + " " + "Joana Silva" + " " + "JoanaSilva999" + " " + h + " " + l);

                        break;
                    case 2: // Modificar margem de emprestimo

                        System.out.println("Modificando margem de emprestimo");
                        //puxar função que modifica a margem de emprestimo

                        break;
                    case 3:
                        System.out.println("Logout Admin");

                    default:
                }  }}while (opcao!=3);

           do {

                System.out.println("Cliente");
            System.out.println("Escolha uma opção");
            opcao=input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Consultar Informações");

                        break;
                    case 2:
                        System.out.println("Depositar");

                        break;
                    case 3:
                        System.out.println("Levantar");

                        break;
                    case 4:
                        System.out.println("Transferir");

                        break;
                    case 5:
                        System.out.println("Simular Crédito");

                        break;
                    case 6:
                        System.out.println("Logout");

                        break;
                    default:

                }}while(opcao!=6);


    }

}