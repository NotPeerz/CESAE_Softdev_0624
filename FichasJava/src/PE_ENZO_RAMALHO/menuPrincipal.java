package PE_ENZO_RAMALHO;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.ex01.imprimirFicheiro;

public class menuPrincipal {
    public static String imprimirCatalogo() throws FileNotFoundException {

        //o return vai ser para retornar a variavel.
        return imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        int opcao;
boolean admin;
        do {
            System.out.println("\n\n***** Bem vindo ao GameStart *****");
            System.out.println("Escolha uma opção.");
            System.out.println("1. Admin");
            System.out.println("2. Cliente");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //Admin
                    System.out.println("Você escolheu Admin.");
                    Scanner input = new Scanner(System.in);
                    admin=false;
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
                                System.out.println("Escolhe um Ficheiro.");
                                System.out.println("1. Vendas");
                                System.out.println("2. Clientes");
                                System.out.println("3. Categorias");
                                opcao=input.nextInt();
                                switch (opcao) {
                                    case 1://Vendas
                                    System.out.println("Vendas");
                                    System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                    break;

                                    case 2://Clientes
                                        System.out.println("Clientes");
                                        System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                        break;

                                    case 3://Categorias
                                        System.out.println("Categorias");
                                        System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                        break;
                                    default:
                                }
                                break;
                            case 2: // Total de vendas: imprime quantas vendas foram executadas e seu valor total.

                                System.out.println("FichasJava/GameStart/GameStart_Vendas.csv");

                                break;

                            case 3: //Total de lucro.

                                System.out.println();

                                break;

                            case 4: //Pesquisa de cliente.

                                System.out.println();

                                break;

                            case 5: //Jogo mais caro.

                                System.out.println();

                                break;

                            case 6: //Melhores Clientes.

                                System.out.println();

                                break;

                            case 7: //Melhor Categoria.

                                System.out.println();

                                break;

                            case 8: //Pesquisa de Vendas.

                                System.out.println();

                                break;

                            case 9: //Top 5 jogos.

                                System.out.println();

                                break;

                            case 10: //Bottom 5 jogos.

                                System.out.println();

                                break;

                            case 11: //Sair.
                                System.out.println("Obrigado, até à próxima!");
                                break;

                            default:
                                System.out.println("Obrigado por fazer asneiras!");
                                break;
                        }
                        break;
                    }while (opcao!=11);
                    break;
                    case 2: //Cliente
                    System.out.println("Você escolheu Cliente.");

                    do {
                        System.out.println("Escolha uma opção.");
                        System.out.println("1. Novo Registo");
                        System.out.println("2. Procurar estacionamento");
                        System.out.println("3. Imprimir Catálogo");
                        System.out.println("4. Imprimir Catálogos Gráficos");
                        System.out.println("5. Imprimir Catálogo Editora");
                        System.out.println("6. Imprimir Catálogo Categoria");
                        System.out.println("7. Imprimir jogo mais recente");
                        opcao= scanner.nextInt();

                        switch (opcao){
                            case 1: //Registo de Cliente.
                                String nomeCliente, contacto,email;
                                System.out.println("Inserir Cliente");
                                System.out.println("Insira nome:");
                                nomeCliente=scanner.next();
                                System.out.println("Insira Contacto:");
                                contacto=scanner.next();
                                System.out.println("Insira Email:");
                                email=scanner.next();
                                System.out.println("Cliente Inserido com Sucesso:"+nomeCliente+"|"+contacto+"|"+email);

                                break;

                            case 2://Procurar estacionamento.
                                int limite=121;
                                for (int i=1;;i++) {
                                    int triangular=i * (i + 1)/2; // formula de um numero triangular
                                    if (triangular>limite) {
                                        break;
                                    }
                                    if (triangular%5==0){
                                        System.out.println("Lugar de vaga: "+triangular);
                                        System.out.println("Vagas calculadas com sucesso!");
                                    }
                                }
                                break;

                            case 3:// Imprimir Catálogo
                                System.out.println("Apresentando o Catálogo de jogos!");

                                System.out.println(imprimirCatalogo());

                                break;

                            case 4://Imprimir Catálogos Gráficos
                                System.out.println("Escolha uma opção.");
                                System.out.println("1. callOfDuty");
                                System.out.println("2. fifa");
                                System.out.println("3. hollowKnight");
                                System.out.println("4. minecraft");
                                System.out.println("5. mortalKombat");
                                System.out.println("6. overcooked");
                                System.out.println("7. witcher3");
                                opcao= scanner.nextInt();


                                switch (opcao){
                                    case 1://callofduty
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/callOfDuty.txt");

                                        break;
                                    case 2:
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/fifa.txt");

                                        break;
                                    case 3:
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/hollowKnight.txt");

                                        break;
                                    case 4:
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/minecraft.txt");

                                        break;
                                    case 5:
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/mortalKombat.txt");

                                        break;
                                    case 6:
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/overcooked.txt");

                                        break;
                                    case 7:
                                        imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/witcher3.txt");

                                        break;
                                    default:
                                }
                                break;
                            case 5://Imprimir uma Editora
                                System.out.println("Editora a pesquisar");

                                break;
                            case 6:

                                break;
                            case 7:

                                break;
                            default:
                        }
                    }while(opcao!=7);
                    break;
                case 3: //Sair
                    System.out.println("Você escolheu Sair.");

                    break;
                default:
            }

            System.out.println("Por favor insira uma opção valida");

        }while (opcao !=3);

    }

    }