package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.ex01.imprimirFicheiro;

public class menuAdmin {
    public static double valorTotalVendido(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        double totalVendido = 0;

        String linha = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNextLine()) {

            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            totalVendido +=Double.parseDouble(linhaDividida[5]);

        }
        return totalVendido;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        boolean admin;
        opcao=scanner.nextInt();

            //Admin
            Scanner input = new Scanner(System.in);
            admin = true;
            System.out.println("Você escolheu Admin.");

            do {
                if (admin) {

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
                            System.out.println("Escolhe um Ficheiro.");
                            System.out.println("1. Vendas");
                            System.out.println("2. Clientes");
                            System.out.println("3. Categorias");
                            opcao = input.nextInt();

                            switch (opcao) {
                                case 1://Vendas
                                    //FALTA FAZER IMPRIMIR APENAS AS VENDAS
                                    System.out.println("Vendas");
                                    System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                    break;

                                case 2://Clientes
                                    //FALTA FAZER IMPRIMIR APENAS OS CLIENTES
                                    System.out.println("Clientes");
                                    System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                    break;

                                case 3://Categorias
                                    //FALTA FAZER IMPRIMIR APENAS AS CATEGORIAS
                                    System.out.println("Categorias");
                                    System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                    break;
                                default:

                            }
                            break;
                        case 2: // Total de vendas: imprime quantas vendas foram executadas e seu valor total.

                            System.out.println(valorTotalVendido("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 3: //Total de lucro.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 4: //Pesquisa de cliente.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 5: //Jogo mais caro.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 6: //Melhores Clientes.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 7: //Melhor Categoria.

                            System.out.println();

                            break;

                        case 8: //Pesquisa de Vendas.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 9: //Top 5 jogos.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 10: //Bottom 5 jogos.

                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));

                            break;

                        case 11: //Sair.
                            System.out.println("Obrigado, até à próxima!");
                            break;

                        default:

                    }
                    System.out.println("Obrigado por fazer asneiras!");
                }

            }while (opcao != 11);

        }

    }