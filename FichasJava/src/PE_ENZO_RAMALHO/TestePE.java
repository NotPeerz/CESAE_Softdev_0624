package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.ex01.imprimirFicheiro;
import static FichaPratica07.ex07.Ex_07.contarLinhasFicheiro;
import static PE_ENZO_RAMALHO.login2.lerVendas;

public class TestePE {
    public static void imprimirFicheiroCliente() throws FileNotFoundException {
        Scanner scannerFicheiro = new Scanner(new File("FichasJava/FichaPratica07/exercicio_04.csv"));
        while (scannerFicheiro.hasNext()) {
            String linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");
            System.out.println(linhaDividida);
        }
    }
    public static String imprimirCatalogo() throws FileNotFoundException {

        //o return vai ser para chamar a função
        return imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv");
    }
    //imprime o catalogo
    //Função que imprime o Catalogo do ficheiro.

//   public static void lerVendas(String path) throws FileNotFoundException {
//        Scanner scannerFicheiro = new Scanner(new File(path));
//         int vendas = 0;
//        String linha = scannerFicheiro.nextLine();
//        while (scannerFicheiro.hasNextLine()) {
//            linha = scannerFicheiro.nextLine();
//            String[] linhaDividida = linha.split(";");
//            String vendaId=linhaDividida[0];
//            if (seNumerico(vendaId)) {
//                vendas = Integer.parseInt(vendaId);
//            }else{
//                System.out.println("Erro");
//            }
//        }
//        return vendas;
//    }
    //Função que vai ler o ficheiro de vendas imprimindo apenas as vendas, sem soma-las.
   // public static boolean seNumerico(String)

//    public static int pesquisaCliente(String path) throws FileNotFoundException {
    //Pesquisa cliente: dado um idCliente, imprima toas as informações associadas a esse cliente(nome, contacto, email)
    //path ficheiro clientes: "FichasJava/GameStart/GameStart_Clientes.csv"
//        Scanner scannerFicheiro = new Scanner(new File(path));
//        int idCliente = 0;
//        String linha = scannerFicheiro.nextLine();
//
//        while (scannerFicheiro.hasNextLine()) {
//            linha = scannerFicheiro.nextLine();
//            String[] linhaDividida = linha.split(";");
//            idCliente=Integer.parseInt(linhaDividida[0]);
//        }
//        return pesquisaCliente;
//    }

//public static int imprimirFicheiroCliente(String path) throws FileNotFoundException {
//    Scanner scannerFicheiro = new Scanner(new File(path));
//    int idCliente = 0;
//    while ( scannerFicheiro.hasNextLine()){
//        String linha = scannerFicheiro.nextLine();
//        String[] linhaDividida = linha.split(";");
//        idCliente= Integer.parseInt(linhaDividida[1]);
//
//    }
//    return idCliente;
//}

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
    //Função para ler vendas.(pelo ficheiro de vendas)

    public static String[] obterValores(String path, String campo, String delimitador) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        if (scanner.hasNextLine()) return null;
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
    //Função que obtem os valores.

    public static void exibirTotalDeLucro(String pathVendas, String pathCategorias) throws FileNotFoundException {
        String[] valoresNomeCategoria, valoresPercentagemCategoria, valoresCategoriaVendas, valoresValorVendas;
        valoresNomeCategoria = obterValores(pathCategorias, "nomeCategoria", ";");
        valoresPercentagemCategoria = obterValores(pathCategorias, "percentagemMargem", ";");
        valoresCategoriaVendas = obterValores(pathVendas, "categoria", ";");
        valoresValorVendas = obterValores(pathVendas, "valor", ";");
        double lucroTotal = 0;

        for (int i = 0; i < valoresCategoriaVendas.length; i++) {
            String categoria = valoresCategoriaVendas[i];
            int indexNomeCategoria = -1;
            for (int j = 0; j < valoresNomeCategoria.length; j++) {
                if (valoresNomeCategoria[j].equals(categoria)) indexNomeCategoria = j;
            }

            if (indexNomeCategoria > -1) {
                double porcentagemLucro = Double.parseDouble(valoresPercentagemCategoria[indexNomeCategoria]);
                double valorVenda = Double.parseDouble(valoresValorVendas[i]);

                lucroTotal += (valorVenda * porcentagemLucro) / 100;
            }
        }
        System.out.println("Lucro total das vendas por categoria: " + lucroTotal);
    }
    //Função que denomina o lucro.

    public static String admin= "admin";
    public static String adminSenha = "456";
    //Funções que dão valor para as credenciais do admin.

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //inicio do programa.
        while (true) {
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
                        //adminLogin, para abrir o menu do admin, assim mostrando o que tem la dentro.
                        adminMenu(scanner);
                        //adminMenu scanner para ler a função associada ao menu do admin
                    }else{
                        imprimirFicheiro("FichasJava/src/PE_ENZO_RAMALHO/copyEnzo.txt");
                        System.out.println("Saindo...");
                    }
                    break;

                    case 2:// menu do cliente
                        clientMenu(scanner);
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
                admin.equals(usuario) &&
                        adminSenha.equals(senha);
    }
    //Função que faz o login do admin.

    public static void adminMenu(Scanner scanner) throws FileNotFoundException {
        while (true) {
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

            switch (opcao) {
                case 1:
                    System.out.println("Escolhe um Ficheiro.");
                    System.out.println("1. Vendas");
                    System.out.println("2. Clientes");
                    System.out.println("3. Categorias");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1://Vendas
                            //imprime as vendas
                            System.out.println("Vendas: ");
                            lerVendas("FichasJava/GameStart/GameStart_Vendas.csv");
                            break;

                        case 2://Clientes
                            //faz pesquisa cliente
                            System.out.println("Clientes: ");
                            System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Clientes.csv"));
                            break;

                        case 3://Categorias
                            //imprime as categorias
                            System.out.println("Categorias: ");
                            System.out.println(imprimirFicheiro(""));
                            break;
                        default:
                    }
                    break;

                case 2:
                    System.out.println("Aqui está o total de vendas Admin!!");
                    System.out.println(valorTotalVendido("FichasJava/GameStart/GameStart_Vendas.csv"));
                    break;

                case 3://Total lucro
                    exibirTotalDeLucro("FichasJava/GameStart/GameStart_Vendas.csv","FichasJava/GameStart/GameStart_Categorias.csv");
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
                        }
                    }
                    System.out.println("Vagas calculadas com sucesso!");
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

                case 5://Imprimir uma Editora nao tem
                    System.out.println("Editora a pesquisar: ");
                    break;

                case 6://Imprimir catalogo categoria, igual o da editora.
                    System.out.println("Catalogo Categoria: ");
                    //nao tem
                    break;

                case 7:
                    //imprimir jogo mais recente
                    System.out.println("Este é o jogo mais recente: ");
                    // nao tem
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
        //função do menu do cliente
        }