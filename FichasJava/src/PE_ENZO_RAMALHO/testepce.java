package PE_ENZO_RAMALHO;

import java.util.Scanner;

import static FichaPratica06.ex05.*;

public class testepce {
    public static void main(String[] args) {

        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar se é CLIENTE ou ADMIN.

        int opcao;
        do {

            // Declarar variaveis

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

                    System.out.println("");

                    break;

                case 2: // Total de vendas: imprime quantas vendas foram executadas e seu valor total.

                    System.out.println("");

                    break;

                case 3: //


                    break;

                case 4: //

                    System.out.println("");

                    break;

                case 5: //

                    System.out.println("");

                    break;

                case 6: //

                    System.out.println("");

                    break;

                case 7: //

                    System.out.println("");

                    break;

                case 8: //

                    System.out.println("");

                    break;

                case 9: //

                    System.out.println("");

                    break;

                case 10: //

                    System.out.println("");

                    break;

                case 11:
                    System.out.println("Obrigado, até à próxima!");
                    break;

                default:
                    System.out.println("Obrigado por fazer asneiras!");
                    break;
            }
        } while (opcao != 11);


        
//        int opcao;
//
//        System.out.println("Olá, Seja bem-vindo ADMIN!");
//        System.out.println("Escolha uma opção!");
//        System.out.println("Fichas:1. Vendas, 2. Clientes, 3. Categorias.");
    }
}