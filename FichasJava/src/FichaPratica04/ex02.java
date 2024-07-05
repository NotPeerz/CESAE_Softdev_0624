package FichaPratica04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Inport Scanner - uso sempre que precisar ler coisas do teclado
        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("1.Criar");
        System.out.println("2.Atualizar");
        System.out.println("3.Eliminar");
        System.out.println("4.Sair");

        System.out.print("Escolha uma opção:  ");

        opcao = input.nextInt();
            do {
      switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Criar");

                    break;
                case 2:
                    System.out.println("Você escolheu Atualizar");

                    break;
                case 3:
                    System.out.println("Você escolheu Eliminar");

                    break;
                case 4:
                    System.out.println("Você escolheu Sair");

                    break;
                default:
                    System.out.println("Invalido");
            }}while (opcao >= 5); {
                    System.out.println("1.Criar");
                    System.out.println("2.Atualizar");
                    System.out.println("3.Eliminar");
                    System.out.println("4.Sair");
                    System.out.print("Escolha uma opção:  ");
                    opcao = input.nextInt();
                    System.out.println("Opção invalida");

                }

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Criar");
                    break;

                case 2:
                    System.out.println("Você escolheu Atualizar");
                    break;

                case 3:
                    System.out.println("Você escolheu Eliminar");
                    break;

                case 4:
                    System.out.println("Você escolheu Sair");
                    break;
                default:
                    if (opcao > 4)
                    System.out.println("Por favor escolha uma opção valida");
                    System.out.println("1.Criar, 2.Atualizar, 3.Eliminar, 4.Sair");
                    opcao=input.nextInt();

            while(opcao<=4);
            System.out.println("Escolha uma opção:");
            System.out.println("1.Criar, 2.Atualizar, 3.Eliminar, 4.Sair");
            }
        }
        }
