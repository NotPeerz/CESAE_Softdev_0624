package PE_ENZO_RAMALHO;

import java.io.File;
import java.util.Scanner;

import static FichaPratica06.ex05.*;

public class menuAdmin {
    public static void main(String[] args) {

        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);
        String path;
        //Scanner scannerFicheiro = new Scanner(new File(path));
        boolean admin = false;

        //Declarar se é cliente ou admin.
        System.out.println("Olá, Cliente ou ADMIN?");


        int opcao;
        do {
            if (admin)

                //Mostrar opções do menu ADMIN.

                System.out.println("\n\n***** Bem vindo ao GameStart *****");
            System.out.println("1. Consulta de Ficheiros: Vendas, Clientes e Categorias");
            System.out.println("2. Total de Vendas");
            System.out.println("3. Total de Lucro");
            System.out.println("4. Pesquisa de Cliente");
            System.out.println("5. Jogo mais caro");
            System.out.println("6. Melhores Clientes");
            System.out.println("7. Melhor Categoria");
            System.out.println("8. Pesquisa Vendas");
            System.out.println("9. Top 5 jogos");
            System.out.println("10. Bottom 5 jogos");
            System.out.println("11. Sair");

            System.out.println("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Consulta os ficheiros de vendas, clientes e categorias consoante a escolha.

                    System.out.println("Vendas, Clientes e Categorias");

                    break;

                case 2: // Total de vendas: imprime quantas vendas foram executadas e seu valor total.

                    System.out.println("");

                    break;

                case 3: //Total de lucro.

                    System.out.println();

                    break;

                case 4: //Pesquisa de cliente.

                    System.out.println("");

                    break;

                case 5: //Jogo mais caro.

                    System.out.println("");

                    break;

                case 6: //Melhores Clientes.

                    System.out.println("");

                    break;

                case 7: //Melhor Categoria.

                    System.out.println("");

                    break;

                case 8: //Pesquisa de Vendas.

                    System.out.println("");

                    break;

                case 9: //Top 5 jogos.

                    System.out.println("");

                    break;

                case 10: //Bottom 5 jogos.

                    System.out.println("");

                    break;

                case 11: //Sair.
                    System.out.println("Obrigado, até à próxima!");
                    break;

                default:
                    System.out.println("Obrigado por fazer asneiras!");
                    break;
            }
        } while (opcao != 11);
    }
}