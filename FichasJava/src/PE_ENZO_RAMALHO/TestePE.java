package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.ex01.imprimirFicheiro;
import static FichaPratica07.ex07.contarLinhasFicheiro;

public class TestePE {
    public static String imprimirPesquisaCliente(String path) throws FileNotFoundException {
        //scanner ficheiro para armazenar informações do ficheiro
        Scanner scannerFicheiro = new Scanner(new File("FichasJava/GameStart/GameStart_Clientes.csv"));
        //scanner para a variavel
        Scanner scanner = new Scanner(System.in);
        //variavel cliente
        int idCliente;
        System.out.println("Pesquisar id Cliente🔎:");
        //scanner da variavel
        idCliente=scanner.nextInt();
        //ciclo
        while (scannerFicheiro.hasNextLine()) {
            //scanneado a linha caso tenha proxima linha
            String linha = scannerFicheiro.nextLine();
            //dividindo a linha por ";"
            String[] linhaDividida = linha.split(";");
            //se o id do cliente for maior que 0 e menor ou igual a 90 imprime a linha dividida 1,2,3 (no caso a coluna)
            if(idCliente>0 && idCliente<=90) {
                System.out.println(linhaDividida[1]+" ");
                System.out.println(linhaDividida[2]+" ");
                System.out.println(linhaDividida[3]+" ");
                System.out.println("🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎🔎");
            }
        }
        return imprimirPesquisaCliente("FichasJava/GameStart/GameStart_Clientes.csv");
 //falta implementar para não ser um ciclo infinito e dar espaçamento entre as informações.
    }
    //Função que pesquisa o Cliente pelo seu id.
    public static double valorTotalVendido(String path) throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File(path));
        //variavel para o valor totalVendido sendo double para valores nao inteiros.
        double totalVendido = 0;
        String linha = scannerFicheiro.nextLine();
//ciclo
        while (scannerFicheiro.hasNextLine()) {
            //enquanto ficheiro tiver proxima linha, faz o scan da linha.
            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";"); //linha dividida por ";"
            totalVendido +=Double.parseDouble(linhaDividida[5]); // double parse double para somar as variaveis double da coluna 5 e atribuindo esse valor para totalVendido.
        }
        return totalVendido; //retorna o valor
    }
    //Função que calcula o valor total das vendas.(pelo ficheiro de vendas

    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException {
        Scanner scFicheiro = new Scanner(new File(path));
        int quantidadeParametros = 0;
        if (scFicheiro.hasNextLine()) quantidadeParametros = scFicheiro.nextLine().split(";").length;
        String[][] matrizCompleta = new String[contarLinhasFicheiro(path)-1][quantidadeParametros];
        String linha;
        int contadorLinhaMatriz = 0;
        while (scFicheiro.hasNextLine()) {
            linha = scFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");
            for (int coluna = 0; coluna < quantidadeParametros; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }
            contadorLinhaMatriz++;
        }
        return matrizCompleta;
    }
    //Função para ler matriz completa pelo path de vendas, apenas raciocinio.

    public static String[] obterValores(String path, String campo, String delimitador) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        if (scanner.hasNextLine()) return null; //se o ficheiro tiver proxima linha returna nulo
        String linha = scanner.nextLine();
        if (linha.contains(campo)) {
            String[] campos = linha.split(delimitador);
            int indexCampo = -1;
            for (int i = 0; i < campos.length; i++) {
                if (campos[i].equals(campo)) indexCampo = i;
            }
            if (indexCampo > -1) {
                int quantidadeLinhas = contarLinhasFicheiro(path);
                String[] valoresCampoEspecifico = new String[quantidadeLinhas];
                for (int i = 0; i < quantidadeLinhas; i++) {
                    valoresCampoEspecifico[i] = scanner.nextLine().split(delimitador)[indexCampo];
                }
                return valoresCampoEspecifico;
            }
        }
        return null;
    }
    //Função que obtem os valores para o lucro.

    public static void exibirTotalDeLucro(String pathVendas, String pathCategorias) throws FileNotFoundException { //declarando as Strings para lerem dois path de ficheiros diferentes.
        String[] valoresNomeCategoria, valoresPercentagemCategoria, valoresCategoriaVendas, valoresValorVendas; // declarando os valores como uma string de array
        valoresNomeCategoria = obterValores(pathCategorias, "nomeCategoria", ";"); //atribuindo um valor para o nome de cada categoria, no qual vai obter os valores do ficheiro de categorias com o delimitador ";" para chegar na categoria
        valoresPercentagemCategoria = obterValores(pathCategorias, "percentagemMargem", ";"); //atribuindo um valor para a porcentagem, na qual vai obter os valores do ficheiro de categorias e pegar a porcentagem de margem utilizando o delimitador ";" para chegar na coluna da porcentagem
        valoresCategoriaVendas = obterValores(pathVendas, "categoria", ";"); //atribuindo um valor para as categorias de vendas, na qual obtem os valores do ficheiro de vendas usando o delimitador ";" como se fosse a "linha dividida"
        valoresValorVendas = obterValores(pathVendas, "valor", ";"); //atribuindo um valor para o valor das vendas, na qual o valor +e obtido lendo o ficheiro de vendas e usando o delimitador ";" para chegar ate as vendas
        double lucroTotal = 0; //declarando a variavel do lucro

        for (int i = 0; i < valoresCategoriaVendas.length; i++) { //ciclo for para ler categoriaVendas até sua ultima linha
            String categoria = valoresCategoriaVendas[i]; //declarando seu indice linha
            int indexNomeCategoria = -1; //declarando um index para o nome da categoria que começe no 0
            for (int j = 0; j < valoresNomeCategoria.length; j++) { //ciclo for para fazer o index ser lida ate sua ultima coluna
                if (valoresNomeCategoria[j].equals(categoria)) indexNomeCategoria = j;
            }

            if (indexNomeCategoria > -1) { //se o nome da categoria for maior que -1...
                double porcentagemLucro = Double.parseDouble(valoresPercentagemCategoria[indexNomeCategoria]); // declarando a variavel da porcentagem de lucro e fazendo ela ser somada aos valores da porcentagem por categoria lendo o index
                double valorVenda = Double.parseDouble(valoresValorVendas[i]); // declarando a variavel valod da venda fazendo ela ser somada com os valores das vendas das linhas

                lucroTotal += (valorVenda * porcentagemLucro) / 100; //lógica do lucro por porcentagem
            }
        }
        System.out.println("Lucro total das vendas por categoria: " + lucroTotal); //mostrando o lucrototal.
    }
    //Função que exibe o lucro.

    public static String admin= "admin"; //declarando o usuario de login
    //Funções que dão valor para as credenciais do admin.
    public static String adminSenha = "456"; //declarando a senha de login
    //Funções que dão valor para as credenciais do admin.

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //inicio do programa.
        while (true) { //ciclo para repetir o programa
            System.out.println("\n 👾👾👾Bem vindo ao GameStart👾👾👾");
            System.out.println("1. Admin");
            System.out.println("2. Cliente");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if (adminLogin(scanner)) {
                        //adminLogin, para acessar o menu admin.
                        adminMenu(scanner);
                        //adminMenu scanner para ler a função associada ao menu do admin, assim mostrando o menu.
                    }else{ //caso nao acerte o login
                        System.out.println("Credenciais incorretas...");
                    }
                    break;

                    case 2:// menu do cliente
                        clientMenu(scanner);
                        //função que invoca o menu do cliente
                        break;

                        case 3:// sair
                            imprimirFicheiro("FichasJava/src/PE_ENZO_RAMALHO/copyEnzo.txt");
                            System.out.println("Saindo...");
                            return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    //função main
    public static boolean adminLogin(Scanner scanner) {
        System.out.println("Digite seu usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        return
                admin.equals(usuario) && // faz o valor atribuido a string admin ser aberta caso igual ao usuario
                        adminSenha.equals(senha); // faz o valor atribuido a string adminSenha ser aberta caso igual a senha
    }
    //Função login do admin.

    public static void adminMenu(Scanner scanner) throws FileNotFoundException {
        while (true) { //ciclo para repetir o menu
            //dando boas vindas ao admin.
            System.out.println("Olá Admin, Seja bem-vindo!");
            System.out.println("Aqui está o menu Admin ✔: ");
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

            switch (opcao) { //switch para opcao
                case 1:
                    System.out.println("Escolha um Ficheiro.");
                    System.out.println("1. Vendas");
                    System.out.println("2. Clientes");
                    System.out.println("3. Categorias");
                    opcao = scanner.nextInt();

                    switch (opcao) { //switch para opcao
                        case 1://Vendas
                            //imprime as vendas
                            System.out.println("Vendas: ");
                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                            break;

                        case 2://Clientes
                            //imprime as informações dos clientes
                            System.out.println("Clientes: ");
                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Clientes.csv"));
                            break;

                        case 3://Categorias
                            //imprime as categorias
                            System.out.println("Categorias: ");
                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Categorias.csv"));
                            break;
                        default:
                    }
                    break;

                case 2://função Valor total das vendas.
                    System.out.println("Aqui está o total de vendas Admin!!");
                    System.out.println(valorTotalVendido("FichasJava/GameStart/GameStart_Vendas.csv"));
                    break;

                case 3://função total lucro.
                    exibirTotalDeLucro("FichasJava/GameStart/GameStart_Vendas.csv","FichasJava/GameStart/GameStart_Categorias.csv");
                    break;

                case 4: //função Pesquisa de cliente.
                    imprimirPesquisaCliente("FichasJava/GameStart/GameStart_Clientes.csv");
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
                    imprimirFicheiro("FichasJava/src/PE_ENZO_RAMALHO/copyEnzo.txt");
                    System.out.println("Obrigado, até à próxima!");
                    break;
                default:
                    System.out.println("Opção inválida,tente novamente!");
                    return;
            }
            }
        }
        // função do menu do admin

        public static void clientMenu(Scanner scanner) throws FileNotFoundException {
        while (true) { //ciclo para repetir o menu do cliente
            System.out.println("Seja Bem-Vindo Cliente!");
            System.out.println("Aqui está seu menu: ");
            System.out.println("1. Novo Registo");
            System.out.println("2. Procurar estacionamento");
            System.out.println("3. Imprimir Catálogo");
            System.out.println("4. Imprimir Catálogos Gráficos");
            System.out.println("5. Imprimir Catálogo Editora");
            System.out.println("6. Imprimir Catálogo Categoria");
            System.out.println("7. Imprimir jogo mais recente");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            scanner.nextLine();
            switch (opcao) { //switch para opcao

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
                    int limite=121; //declarando variavel inteira para o limite de vagas
                    for (int i=1;;i++) { //fazendo uma lógica para contar o triangular
                        int triangular=i * (i + 1)/2; // formula de um numero triangular
                        if (triangular>limite) { //se o triangular for maior q o limite
                            break;
                        }
                        if (triangular%5==0){ //se o triangular puder ser dividido por 5 e que de resto =0.
                            System.out.println("Lugar de vaga: "+triangular); //mostrar triangular
                        }
                    }
                    System.out.println("Vagas calculadas com sucesso!");
                    break;

                case 3:// Imprimir Catálogo
                    System.out.println("Apresentando o Catálogo de jogos!");
                    System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
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
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/callOfDuty.txt");
                            break;
                        case 2:
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/fifa.txt");
                            break;
                        case 3:
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/hollowKnight.txt");
                            break;
                        case 4:
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/minecraft.txt");
                            break;
                        case 5:
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/mortalKombat.txt");
                            break;
                        case 6:
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/overcooked.txt");
                            break;
                        case 7:
                            //Função que imprime o ficheiro de texto
                            imprimirFicheiro("FichasJava/GameStart/CatalogoGrafico/witcher3.txt");
                            break;
                        default:
                    }
                    break;

                case 5://Imprimir uma Editora
                    System.out.println("Editora a pesquisar: ");
                    break;

                case 6://Imprimir catalogo categoria, igual o da editora.
                    System.out.println("Catalogo Categoria: ");
                    break;

                case 7:
                    //imprimir jogo mais recente
                    System.out.println("Este é o jogo mais recente: ");
                    break;

                case 8:
                    System.out.println("Saindo...");
                    imprimirFicheiro("FichasJava/src/PE_ENZO_RAMALHO/copyEnzo.txt");
                    return;
                default:
                    System.out.println("Opção inválida,tente novamente!");
            }

            }

        }

        }