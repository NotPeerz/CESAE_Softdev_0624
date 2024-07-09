package PE_ENZO_RAMALHO;

import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class testeLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
boolean admin;

        do {
            System.out.println("Escolha uma opção.");
            System.out.println("1. Admin");
            System.out.println("2. Cliente");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //Admin
                    System.out.println("Você escolheu Admin.");

                    break;
                case 2: //Cliente
                    System.out.println("Você escolheu Cliente.");
                    do {
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
                                for (int i=1;i*(i+1)*(i+2)>limite;i++)

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

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
        } while (opcao !=3);
        System.out.println("Por favor insira uma opção valida");

    }
}
