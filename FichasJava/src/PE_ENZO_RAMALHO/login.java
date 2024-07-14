package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.ex01.imprimirFicheiro;

public class login {
    public static String imprimirCatalogo() throws FileNotFoundException {

        //o return vai ser para retornar a variavel.
        return imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv");
    }
    //Função que imprime o Catalogo do ficheiro.

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
    //Função que calcula o valor total das vendas.(pelo ficheiro de vendas

    public static double lerVendas(String path) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(path));
        double vendas = 0;
        String linha = scannerFicheiro.nextLine();

        while (scannerFicheiro.hasNextLine()) {
            //corrigir para ler apenas as vendas sem ser somadas
            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");
            vendas=Double.parseDouble(linhaDividida[5]);
        }
        return vendas;
    }

    public static String admin= "admin";
    public static String adminSenha = "456";
    //Funções que dão valor para as credenciais do admin.

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //inicio do programa.
        while (true) {
            System.out.println("******Bem vindo ao GameStar******");
            System.out.println("1. Admin");
            System.out.println("2. Cliente");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            int opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (adminLogin(scanner)) {
                        //adminLogin, para abrir o menu do admin, assim mostrando o que tem la dentro.
                        adminMenu(scanner);
                        //adminMenu scanner para ler a função associada ao menu do admin
                    }else{
                        System.out.println("Saindo...");
                    }
                    break;

                    case 2:
                        clientMenu(scanner);
                        break;

                        case 3:
                            System.out.println("Saindo...");
                            return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    public static boolean adminLogin(Scanner scanner) {
        System.out.println("Digite seu usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        return
                admin.equals(usuario) &&
                        adminSenha.equals(senha);
    }
    //Função que faz o login do admin.

    public static void adminMenu(Scanner scanner) throws FileNotFoundException {
        while (true) {
            //dando boas vindas ao mestre. xD
            System.out.println("Olá Admin, Seja bem-vindo!");
            System.out.println("Aqui está o menu Admin: ");
            // adicionar menu admin
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
            int opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolhe um Ficheiro.");
                    System.out.println("1. Vendas");
                    System.out.println("2. Clientes");
                    System.out.println("3. Categorias");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1://Vendas
                            //FALTA FAZER IMPRIMIR APENAS AS VENDAS.
                            System.out.println("Vendas: ");
                            System.out.println(lerVendas("FichasJava/GameStart/GameStart_Vendas.csv"));
                            break;

                        case 2://Clientes
                            //FALTA FAZER IMPRIMIR APENAS OS CLIENTES
                            System.out.println("Clientes");
                            System.out.println(imprimirFicheiro(""));
                            break;

                        case 3://Categorias
                            //FALTA FAZER IMPRIMIR APENAS AS CATEGORIAS. ja estava feito e perdi
                            System.out.println("Categorias");
                            System.out.println(imprimirFicheiro(""));
                            break;
                        default:
                    }

                    break;
                case 2:
                    System.out.println(valorTotalVendido("FichasJava/GameStart/GameStart_Vendas.csv"));
                    break;

                case 3://Total lucro
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
                    System.out.println("Opção inválida,tente novamente!");
            }
            }
        }
        public static void clientMenu(Scanner scanner) throws FileNotFoundException {
        while (true) {
            System.out.println("Menu Cliente: ");
            System.out.println("1. Novo Registo");
            System.out.println("2. Procurar estacionamento");
            System.out.println("3. Imprimir Catálogo");
            System.out.println("4. Imprimir Catálogos Gráficos");
            System.out.println("5. Imprimir Catálogo Editora");
            System.out.println("6. Imprimir Catálogo Categoria");
            System.out.println("7. Imprimir jogo mais recente");
            System.out.println("Escolha uma opção.");
            int opcao = scanner.nextInt();

            scanner.nextLine();
            switch (opcao) {

                case 1:
                    //Registo de Cliente.
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
                case 8:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida,tente novamente!");
            }
            }
        }
        }