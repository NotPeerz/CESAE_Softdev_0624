package TestePraticoRecuperacaoPce;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class menuAdmin {
    public static int matriz(String path) throws FileNotFoundException{
        // Import Scanner
        Scanner input = new Scanner(System.in);
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
        return matriz("FichasJava/src/TestePraticoRecuperacaoPce/5dados");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        boolean admin = false;
        String pass="admin123";

        //Admin
        Scanner input = new Scanner(System.in);
        System.out.println("1. admin ou 2. cliente?");
        opcao=scanner.nextInt();
        do {
            if (admin) {
                System.out.println("Você escolheu Admin.");

                //Mostrar opções do menu ADMIN.

                System.out.println("\n\n***** Bem vindo ao banco, ADMIN! *****");
                System.out.println("1. Consulta Informações");
                System.out.println("2. Modificar Margem de Empréstimo");

                switch (opcao) {
                    case 1: // Consulta as informações
                        System.out.println("Informações");
                        //puxar função da matriz com os 5 dados das 4 contas. (matriz completa!)!
                        System.out.println(matriz("FichasJava/src/TestePraticoRecuperacaoPce/5dados"));
                        break;
                    case 2: // Modificar margem de emprestimo

                        System.out.println("Modificando margem de emprestimo");
                        //puxar função que modifica a margem de emprestimo

                        break;

                    default:

                }
            }

        }while (opcao==1);

    }

}