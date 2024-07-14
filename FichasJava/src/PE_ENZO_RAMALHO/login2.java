package PE_ENZO_RAMALHO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.ex01.imprimirFicheiro;

public class login2{
    public static void main(String[] args) throws FileNotFoundException{
    Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean admin=true;

        System.out.println("admin ou cliente? ");
        String usuario = scanner.nextLine();

        if (oiAdmin(usuario)) {
            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();

            if (senha.equals("admin123")) {
                System.out.println("Seja bem-vindo Admin!");
                admin=true;
                //aqui eu defini que se no metodo oiadmin, a senha for igual a (admin123) ele printa dando boas vindas e considera meu boolean admin como verdade.

            } else {

                //caso contrario senha invalida.
                System.out.println("Senha invalida!");
            }

        } else {

            //que se a senha der invalida ele chama o cliente.
            System.out.println("Seja bem-vindo Cliente!");
        }

        do {
            if (admin) {

                //Mostrar opções do menu ADMIN.

                System.out.println("\n\n***** Bem vindo ao Game Start *****");
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
                opcao = scanner.nextInt();
                //declaro meu menu e dou input na opcao.

                switch (opcao) {
                    case 1: // Consulta os ficheiros de vendas, clientes e categorias consoante a escolha.
                        System.out.println("Escolhe um Ficheiro.");
                        System.out.println("1. Vendas");
                        System.out.println("2. Clientes");
                        System.out.println("3. Categorias");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1://Vendas
                                //FALTA FAZER IMPRIMIR APENAS AS VENDAS. ja estava feito e perdi
                                System.out.println("Vendas");
                                System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                break;

                            case 2://Clientes
                                //FALTA FAZER IMPRIMIR APENAS OS CLIENTES
                                System.out.println("Clientes");
                                System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                break;

                            case 3://Categorias
                                //FALTA FAZER IMPRIMIR APENAS AS CATEGORIAS. ja estava feito e perdi
                                System.out.println("Categorias");
                                System.out.println(imprimirFicheiro("FichasJava/GameStart/GameStart_Vendas.csv"));
                                break;
                            default:
                                System.out.println("Opção invalida!");
                        }
                        break;
                    case 2: // Total de vendas: imprime quantas vendas foram executadas e seu valor total.

                        System.out.println(valorTotalVendido("FichasJava/GameStart/GameStart_Vendas.csv"));

                        break;

                    case 3: //Total de lucro.
                        //ja estava feito e perdi tambem.
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
                        System.out.println("Opção invalida!");
                }
                System.out.println("Obrigado por fazer asneiras!");
            }else{

                opcao=11;
            }
        }while (opcao != 11);
}
    private static boolean valorTotalVendido(String path) throws FileNotFoundException {
       Scanner scanner = new Scanner(new File(path));
       double totalVendas=0;
       int totalQuantidade=0;

       while (scanner.hasNextLine()) {
           String linha = scanner.nextLine();
           String[] coluna = linha.split(",");
           double valor =Double.parseDouble(coluna[5]);
           totalVendas+=valor;
           totalQuantidade++;
       }
       scanner.close();
       return valorTotalVendido("FichasJava/GameStart/GameStart_Vendas.csv");
    }

    private static boolean oiAdmin(String usuario) {

        return true;
    }

}